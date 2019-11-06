package kosta.mvc.model.dto;

public class WeatherDTO {
	private String PubDate;//날짜??!!
	private String nm;//관측지역??!!
	private String POP; // 강수확률
	private String PTY; // 강수형태
	private String R06; // 6시간 강수량
	private String REH; // 습도
	private String S06; // 6시간 신적설
	private String SKY; // 하늘상태
	private String T3H; // 3시간 기온
	private String TMN; // 일최저기온
	private String TMX; // 일최고기온
	private String UUU; // 풍속(동서성분)
	private String VVV; // 풍속(남북성분)
	private String WAV; // 파고
	private String VEC; // 풍향
	private String WSD; // 풍속

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
		return PubDate.substring(0, 4) + "년 " + PubDate.substring(4, 6) + "월 " + PubDate.substring(6, 8) + "일 [" + nm
				+ "]의 날씨 정보" + "\n평균기온 :" + taAvg + "\n최저기온 :" + taMin + "\n최고기온 :" + taMax + "\n평균습도 :" + hdAvg
				+ "\n최저습도 :" + hdMin + "\n최고습도 :" + hdMax + "\n평균풍속" + wsAvg + "\n최대풍속" + wsMax + "\n강수량" + rnSum;
	}
}
