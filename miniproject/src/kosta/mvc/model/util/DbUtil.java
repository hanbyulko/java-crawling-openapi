package kosta.mvc.model.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;

public class DbUtil {
	private static Properties proFile = new Properties();
	/**
	 * DB������ ���� �ε�, ����, ����
	 */

	/**
	 * �ε�
	 */
	static {
		// 2���� ~.properties ���� �ε�
		try {  //
			proFile.load(new FileInputStream(new File("src/kosta/mvc/model/util/dbInfo.properties")));
//			proFile.load(new FileInputStream(new File("src/kosta/mvc/model/util/board.properties")));

			Class.forName(proFile.getProperty("driverName"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}// ���� �ε�� ����ƽ ��Ͼȿ�����

	/**
	 * ����
	 * 
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(proFile.getProperty("url"), proFile.getProperty("userName"),
				proFile.getProperty("userPass"));
	}
	// �ν��Ͻ������ ����ִ°� �ƴ϶� ����ƽ�޼ҵ�� ������

	/**
	 * �ݱ� (DB���� ���� ��ü���� Close()�Ѵ�)
	 * 
	 * @throws IOException
	 * @throws SQLException
	 */
	// INSERT UPDATE DELETE�� ���
	// SELECT�ΰ�� 2������ �����ؼ� �޼ҵ� �����ε�
	public static void dbClose(Connection con, Statement stmt) {
		try {
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void dbClose(Connection con, Statement stmt, ResultSet rst) {
		try {
			if (rst != null)
				rst.close();
			dbClose(con, stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Properties getProFile() {
		return proFile;
	}

	public static void setProFile(Properties proFile) {
		DbUtil.proFile = proFile;
	}

	public static void main(String[] args) {
		System.out.println(111);
	}

//	public static void close(AutoCloseable ... c) {
//		c.close();
//	}
//AutoCloseable�ξֵ��� �̷��� ó�����ϰ� try-catch-resource������ ó����
}
