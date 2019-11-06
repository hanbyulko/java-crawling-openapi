package kosta.mvc.model.util;

import java.awt.Point;
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
			proFile.load(new FileInputStream(new File("src/kosta/mvc/model/util/dbInfo.properties")));
			proFile.load(new FileInputStream(new File("src/kosta/mvc/model/util/locationInfo.properties")));
			Class.forName(proFile.getProperty("driverName"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}// 보통 로드는 스태틱 블록안에서함

	public static String getCode(String location) throws Exception {
		String code = (String) proFile.get(location);
		if (code == null) {
			throw new Exception("서비스가 불가능한 지역입니다");
		}
		return code;
	}

	public static Point getPoint(String location) {
		if (location.equals("종로구")) {
			return new Point(60, 127);
		}
		if (location.equals("중구")) {
			return new Point(60, 127);
		}
		if (location.equals("용산구")) {
			return new Point(60, 126);
		}
		if (location.equals("성동구")) {
			return new Point(61, 126);
		}
		if (location.equals("광진구")) {
			return new Point(62, 127);
		}
		if (location.equals("동대문구")) {
			return new Point(61, 127);
		}
		if (location.equals("중랑구")) {
			return new Point(62, 127);
		}
		if (location.equals("성북구")) {
			return new Point(61, 128);
		}
		if (location.equals("강북구")) {
			return new Point(61, 128);
		}
		if (location.equals("도봉구")) {
			return new Point(61, 129);
		}
		if (location.equals("노원구")) {
			return new Point(61, 129);
		}
		if (location.equals("은평구")) {
			return new Point(59, 128);
		}
		if (location.equals("서대문구")) {
			return new Point(59, 127);
		}
		if (location.equals("마포구")) {
			return new Point(59, 126);
		}
		if (location.equals("양천구")) {
			return new Point(58, 126);
		}
		if (location.equals("강서구")) {
			return new Point(58, 126);
		}
		if (location.equals("구로구")) {
			return new Point(58, 125);
		}
		if (location.equals("금천구")) {
			return new Point(59, 124);
		}
		if (location.equals("영등포구")) {
			return new Point(59, 125);
		}
		if (location.equals("동작구")) {
			return new Point(59, 125);
		}
		if (location.equals("관악구")) {
			return new Point(59, 125);
		}
		if (location.equals("서초구")) {
			return new Point(60, 125);
		}
		if (location.equals("송파구")) {
			return new Point(62, 125);
		}
		if (location.equals("강동구")) {
			return new Point(63, 126);
<<<<<<< HEAD
		return null;		
=======
		}
		return null;

>>>>>>> branch 'master' of https://github.com/wo2306/miniproject.git
	}
}
