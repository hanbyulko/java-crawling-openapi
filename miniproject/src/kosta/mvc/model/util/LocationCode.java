package kosta.mvc.model.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class LocationCode {
	private static Properties proFile = new Properties();
	/**
	 * DB연동을 위한 로드, 연결, 실행
	 */

	/**
	 * 로드
	 */
	static {
		// 2개의 ~.properties 파일 로딩
		try {
			proFile.load(new FileInputStream(new File("src/kosta/mvc/model/util/locationInfo.properties")));
//			proFile.load(new FileInputStream(new File("src/kosta/mvc/model/util/board.properties")));

			Class.forName(proFile.getProperty("driverName"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}// 보통 로드는 스태틱 블록안에서함

	public static String getCode(String location) throws Exception {
		String code = proFile.getProperty(location);
		if (code==null) {
			throw new Exception("서비스가 불가능한 지역입니다");
		}
		return code;
	}
}
