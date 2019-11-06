package kosta.mvc.model.dto;

public class WeatherDTO {
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
	@Override
	public String toString() {
		return "WeatherDTO [POP=" + POP + ", PTY=" + PTY + ", R06=" + R06 + ", REH=" + REH + ", S06=" + S06 + ", SKY="
				+ SKY + ", T3H=" + T3H + ", TMN=" + TMN + ", UUU=" + UUU + ", VEC=" + VEC + "]";
	}
	
}
