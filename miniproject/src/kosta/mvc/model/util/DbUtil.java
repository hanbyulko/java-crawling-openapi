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
	 * DB연동을 위한 로드, 연결, 실행
	 */

	/**
	 * 로드
	 */
	static {
		// 2개의 ~.properties 파일 로딩
		try {  //
			proFile.load(new FileInputStream(new File("src/kosta/mvc/model/util/dbInfo.properties")));
//			proFile.load(new FileInputStream(new File("src/kosta/mvc/model/util/board.properties")));

			Class.forName(proFile.getProperty("driverName"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}// 보통 로드는 스태틱 블록안에서함

	/**
	 * 연결
	 * 
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(proFile.getProperty("url"), proFile.getProperty("userName"),
				proFile.getProperty("userPass"));
	}
	// 인스턴스멤버가 들어있는게 아니라서 스태틱메소드로 만들어도됨

	/**
	 * 닫기 (DB관련 사용된 객체들을 Close()한다)
	 * 
	 * @throws IOException
	 * @throws SQLException
	 */
	// INSERT UPDATE DELETE인 경우
	// SELECT인경우 2가지로 구분해서 메소드 오버로딩
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
//AutoCloseable인애들은 이렇게 처리안하고 try-catch-resource문으로 처리함
}
