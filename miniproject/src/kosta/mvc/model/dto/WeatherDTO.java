package kosta.mvc.model.dto;

public class WeatherDTO {
	private String PubDate;//��¥??!!
	private String nm;//��������??!!
	private String POP; // ����Ȯ��
	private String PTY; // ��������
	private String R06; // 6�ð� ������
	private String REH; // ����
	private String S06; // 6�ð� ������
	private String SKY; // �ϴû���
	private String T3H; // 3�ð� ���
	private String TMN; // ���������
	private String TMX; // ���ְ���
	private String UUU; // ǳ��(��������)
	private String VVV; // ǳ��(���ϼ���)
	private String WAV; // �İ�
	private String VEC; // ǳ��
	private String WSD; // ǳ��

	public WeatherDTO() {
	}

	public WeatherDTO(String pubDate,String pOP, String pTY, String r06, String rEH, String s06, String sKY, String t3h, String tMN,
			String tMX, String uUU, String vVV, String wAV, String vEC, String wSD) {
		super();
		PubDate = pubDate;
		POP = pOP;
		PTY = pTY;
		R06 = r06;
		REH = rEH;
		S06 = s06;
		SKY = sKY;
		T3H = t3h;
		TMN = tMN;
		TMX = tMX;
		UUU = uUU;
		VVV = vVV;
		WAV = wAV;
		VEC = vEC;
		WSD = wSD;
	}

	public String getPubDate() {
		return PubDate;
	}

	public void setPubDate(String pubDate) {
		PubDate = pubDate;
	}

	public String getPOP() {
		return POP;
	}

	public void setPOP(String pOP) {
		POP = pOP;
	}

	public String getPTY() {
		return PTY;
	}

	public void setPTY(String pTY) {
		PTY = pTY;
	}

	public String getR06() {
		return R06;
	}

	public void setR06(String r06) {
		R06 = r06;
	}

	public String getREH() {
		return REH;
	}

	public void setREH(String rEH) {
		REH = rEH;
	}

	public String getS06() {
		return S06;
	}

	public void setS06(String s06) {
		S06 = s06;
	}

	public String getSKY() {
		return SKY;
	}

	public void setSKY(String sKY) {
		SKY = sKY;
	}

	public String getT3H() {
		return T3H;
	}

	public void setT3H(String t3h) {
		T3H = t3h;
	}

	public String getTMN() {
		return TMN;
	}

	public void setTMN(String tMN) {
		TMN = tMN;
	}

	public String getTMX() {
		return TMX;
	}

	public void setTMX(String tMX) {
		TMX = tMX;
	}

	public String getUUU() {
		return UUU;
	}

	public void setUUU(String uUU) {
		UUU = uUU;
	}

	public String getVVV() {
		return VVV;
	}

	public void setVVV(String vVV) {
		VVV = vVV;
	}

	public String getWAV() {
		return WAV;
	}

	public void setWAV(String wAV) {
		WAV = wAV;
	}

	public String getVEC() {
		return VEC;
	}

	public void setVEC(String vEC) {
		VEC = vEC;
	}

	public String getWSD() {
		return WSD;
	}

	public void setWSD(String wSD) {
		WSD = wSD;
	}

	@Override
	public String toString() {
		return PubDate.substring(0, 4) + "�� " + PubDate.substring(4, 6) + "�� " + PubDate.substring(6, 8) + "�� [" + nm
				+ "]�� ���� ����" + "\n��ձ�� :" + taAvg + "\n������� :" + taMin + "\n�ְ��� :" + taMax + "\n��ս��� :" + hdAvg
				+ "\n�������� :" + hdMin + "\n�ְ���� :" + hdMax + "\n���ǳ��" + wsAvg + "\n�ִ�ǳ��" + wsMax + "\n������" + rnSum;
	}
}
