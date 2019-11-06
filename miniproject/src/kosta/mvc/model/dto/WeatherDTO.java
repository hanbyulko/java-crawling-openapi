package kosta.mvc.model.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WeatherDTO {
	private String weatherDate = new SimpleDateFormat("yyyyMMddHHmm", Locale.KOREA).format(new Date());
	private String location;
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
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return weatherDate.substring(0,4)+"년 "+weatherDate.substring(4, 6)+"월 "+weatherDate.substring(6,8)+"일 "+weatherDate.substring(8,10) + "시 " + weatherDate.substring(10, 12) +
				"분 기준 ["+location +"]의 날씨 상태는\n" + "강수확률 :"+ POP + "\n강수형태 :"+PTY+
				"\n6시간 강수량 :" + R06 +"\n습도 :"+REH + "\n6시간 신적설 :"+S06 + 
				"\n하늘상태 :" + SKY + "\n3시간 기온 :" + T3H + "\n일최저기온 :" +TMN + "\n풍속(동서성분) :" +UUU 
				+ "\n풍향 :" +VEC;
	}
}
