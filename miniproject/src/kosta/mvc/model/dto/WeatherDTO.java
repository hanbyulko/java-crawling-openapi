package kosta.mvc.model.dto;

public class WeatherDTO {
	private String obsTm; //관측일자
	private String nm;  //지점명 
	private String taAvg; //평균기온
	private String taMin; //최저기온
	private String taMax; //최고기온
	private String hdAvg; //평균습도
	private String hdMin; //최저습도
	private String hdMax; //최고습도
	private String wsAvg; //평균풍속
	private String wsMax; //최대풍속
	private String rnSum; //강수량
	
	public WeatherDTO() {
		
	}

	public WeatherDTO(String obsTm, String nm, String taAvg, String taMin, String taMax, String hdAvg, String hdMin,
			String hdMax, String wsAvg, String wsMax, String rnSum) {
		super();
		this.obsTm = obsTm;
		this.nm = nm;
		this.taAvg = taAvg;
		this.taMin = taMin;
		this.taMax = taMax;
		this.hdAvg = hdAvg;
		this.hdMin = hdMin;
		this.hdMax = hdMax;
		this.wsAvg = wsAvg;
		this.wsMax = wsMax;
		this.rnSum = rnSum;
	}
	
	

	public String getObsTm() {
		return obsTm;
	}

	public void setObsTm(String obsTm) {
		this.obsTm = obsTm;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getTaAvg() {
		return taAvg;
	}

	public void setTaAvg(String taAvg) {
		this.taAvg = taAvg;
	}

	public String getTaMin() {
		return taMin;
	}

	public void setTaMin(String taMin) {
		this.taMin = taMin;
	}

	public String getTaMax() {
		return taMax;
	}

	public void setTaMax(String taMax) {
		this.taMax = taMax;
	}

	public String getHdAvg() {
		return hdAvg;
	}

	public void setHdAvg(String hdAvg) {
		this.hdAvg = hdAvg;
	}

	public String getHdMin() {
		return hdMin;
	}

	public void setHdMin(String hdMin) {
		this.hdMin = hdMin;
	}

	public String getHdMax() {
		return hdMax;
	}

	public void setHdMax(String hdMax) {
		this.hdMax = hdMax;
	}

	public String getWsAvg() {
		return wsAvg;
	}

	public void setWsAvg(String wsAvg) {
		this.wsAvg = wsAvg;
	}

	public String getWsMax() {
		return wsMax;
	}

	public void setWsMax(String wsMax) {
		this.wsMax = wsMax;
	}

	public String getRnSum() {
		return rnSum;
	}

	public void setRnSum(String rnSum) {
		this.rnSum = rnSum;
	}

	@Override
	public String toString() {
		return obsTm.substring(0,4)+"년 "+obsTm.substring(4, 6)+"월 "+obsTm.substring(6,8)+"일 ["+ nm + "]의 날씨 정보" +
				"\n평균기온 :"+ taAvg + "\n최저기온 :"+taMin+
				"\n최고기온 :" + taMax +"\n평균습도 :"+hdAvg + "\n최저습도 :"+hdMin + 
				"\n최고습도 :" + hdMax + "\n평균풍속" + wsAvg + "\n최대풍속" +wsMax + "\n강수량" + rnSum;
	}
}
