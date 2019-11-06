package kosta.mvc.model.dto;

public class WeatherDTO {
	private String POP; // 강수확률
	private String PTY; // 강수형태
	private String R06; // 6시간 강수량
	private String REH; // 습도
	private String S06; // 6시간 신적설
	private String SKY; // 하늘상태
	private String T3H; // 3시간 기온
	private String TMN; // 일최저기온
	private String UUU; // 풍속(동서성분)
	private String VEC; // 풍향
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
