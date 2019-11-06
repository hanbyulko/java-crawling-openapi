package kosta.mvc.model.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WeatherDTO {
	private String weatherDate = new SimpleDateFormat("yyyyMMddHHmm", Locale.KOREA).format(new Date());
	private String location;
	private String POP; // ����Ȯ��
	private String PTY; // ��������
	private String R06; // 6�ð� ������
	private String REH; // ����
	private String S06; // 6�ð� ������
	private String SKY; // �ϴû���
	private String T3H; // 3�ð� ���
	private String TMN; // ���������
	private String UUU; // ǳ��(��������)
	private String VEC; // ǳ��
	public WeatherDTO(String pOP, String pTY, String r06, String rEH, String s06, String sKY, String t3h, String tMN,
			String uUU, String vEC) {
		super();
		POP = pOP;
		PTY = pTY;
		R06 = r06;
		REH = rEH;
		S06 = s06;
		SKY = sKY;
		T3H = t3h;
		TMN = tMN;
		UUU = uUU;
		VEC = vEC;
	}
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return weatherDate.substring(0,4)+"�� "+weatherDate.substring(4, 6)+"�� "+weatherDate.substring(6,8)+"�� "+weatherDate.substring(8,10) + "�� " + weatherDate.substring(10, 12) +
				"�� ���� ["+location +"]�� ���� ���´�\n" + "����Ȯ�� :"+ POP + "\n�������� :"+PTY+
				"\n6�ð� ������ :" + R06 +"\n���� :"+REH + "\n6�ð� ������ :"+S06 + 
				"\n�ϴû��� :" + SKY + "\n3�ð� ��� :" + T3H + "\n��������� :" +TMN + "\nǳ��(��������) :" +UUU 
				+ "\nǳ�� :" +VEC;
	}
}
