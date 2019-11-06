package kosta.mvc.model.util;

import java.awt.Point;
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

			Class.forName(proFile.getProperty("driverName"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}// ���� �ε�� ����ƽ ��Ͼȿ�����

	public static String getCode(String location) throws Exception {
		String code = proFile.getProperty(location);
		if (code == null) {
			throw new Exception("���񽺰� �Ұ����� �����Դϴ�");
		}
		return code;
	}

	public static Point getPoint(String location) {
		if (location.equals("���α�"))
			return new Point(60, 127);
		if (location.equals("�߱�"))
			return new Point(60, 127);
		if (location.equals("��걸"))
			return new Point(60, 127);
		if (location.equals("������"))
			return new Point(60, 127);
		if (location.equals("������"))
			return new Point(60, 127);
		if (location.equals("���빮��"))
			return new Point(60, 127);
		if (location.equals("�߶���"))
			return new Point(60, 127);
		if (location.equals("���ϱ�"))
			return new Point(60, 127);
		if (location.equals("���ϱ�"))
			return new Point(60, 127);
		if (location.equals("������"))
			return new Point(60, 127);
		if (location.equals("�����"))
			return new Point(60, 127);
		if (location.equals("����"))
			return new Point(60, 127);
		if (location.equals("���빮��"))
			return new Point(60, 127);
		if (location.equals("������"))
			return new Point(60, 127);
		if (location.equals("��õ��"))
			return new Point(60, 127);
		if (location.equals("������"))
			return new Point(60, 127);
		if (location.equals("���α�"))
			return new Point(60, 127);
		if (location.equals("��õ��"))
			return new Point(60, 127);
		if (location.equals("��������"))
			return new Point(60, 127);
		if (location.equals("���۱�"))
			return new Point(60, 127);
		if (location.equals("���Ǳ�"))
			return new Point(60, 127);
		if (location.equals("���ʱ�"))
			return new Point(60, 127);
		if (location.equals("���ı�"))
			return new Point(60, 127);
		if (location.equals("������"))
			return new Point(60, 127);
		if (location.equals("�߱�"))
			return new Point(60, 127);
		return null;

	}
}
