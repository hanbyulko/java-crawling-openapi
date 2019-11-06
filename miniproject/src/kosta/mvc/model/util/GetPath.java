package kosta.mvc.model.util;

public class GetPath {
	public static String dbPath;
	public static String lcPath;
	
	static {
		dbPath = GetPath.class.getResource("dbInfo.properties").getPath();
		lcPath = GetPath.class.getResource("locationInfo.properties").getPath();
	}
	
	public static void main(String[] args) {
		System.out.println(dbPath);
	}
}
