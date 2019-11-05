package kosta.mvc.model.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class LocationCode {
	private static Properties proFile = new Properties();
	/**
	 * DB������ ���� �ε�, ����, ����
	 */

	/**
	 * �ε�
	 */
	static {
		// 2���� ~.properties ���� �ε�
		try {
			proFile.load(new FileInputStream(new File("src/kosta/mvc/model/util/locationInfo.properties")));
//			proFile.load(new FileInputStream(new File("src/kosta/mvc/model/util/board.properties")));

			Class.forName(proFile.getProperty("driverName"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}// ���� �ε�� ����ƽ ��Ͼȿ�����

	public static String getCode(String location) throws Exception {
		String code = proFile.getProperty(location);
		if (code==null) {
			throw new Exception("���񽺰� �Ұ����� �����Դϴ�");
		}
		return code;
	}
}
