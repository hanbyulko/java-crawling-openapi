package kosta.mvc.model.dto;

public class DustDTO {
	private String msrDate; //측정날짜
	private String msRadmCode; //측정소 행정코드
	private String msrStenName; //측정소명
	private String maxIndex; //통합대기환경지수
	private String grade; //통합대기환경지수등급
	private String pollutant; //지수결정물질
	private String nitrogen; //이산화질소
	private String ozone; //오존
	private String carbon; //일산화탄소
	private String sulfurous;//아황산가스
	private String pm10; //미세먼지농도
	private String pm25; //초미세먼지농도
	public String getMsrDate() {
		return msrDate;
	}
	public void setMsrDate(String msrDate) {
		this.msrDate = msrDate;
	}
	public String getMsRadmCode() {
		return msRadmCode;
	}
	public void setMsRadmCode(String msRadmCode) {
		this.msRadmCode = msRadmCode;
	}
	public String getMsrStenName() {
		return msrStenName;
	}
	public void setMsrStenName(String msrStenName) {
		this.msrStenName = msrStenName;
	}
	public String getMaxIndex() {
		return maxIndex;
	}
	public void setMaxIndex(String maxIndex) {
		this.maxIndex = maxIndex;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getPollutant() {
		return pollutant;
	}
	public void setPollutant(String pollutant) {
		this.pollutant = pollutant;
	}
	public String getNitrogen() {
		return nitrogen;
	}
	public void setNitrogen(String nitrogen) {
		this.nitrogen = nitrogen;
	}
	public String getOzone() {
		return ozone;
	}
	public void setOzone(String ozone) {
		this.ozone = ozone;
	}
	public String getCarbon() {
		return carbon;
	}
	public void setCarbon(String carbon) {
		this.carbon = carbon;
	}
	public String getSulfurous() {
		return sulfurous;
	}
	public void setSulfurous(String sulfurous) {
		this.sulfurous = sulfurous;
	}
	public String getPm10() {
		return pm10;
	}
	public void setPm10(String pm10) {
		this.pm10 = pm10;
	}
	public String getPm25() {
		return pm25;
	}
	public void setPm25(String pm25) {
		this.pm25 = pm25;
	}
	
	public DustDTO(String msrDate, String msRadmCode, String msrStenName, String maxIndex, String grade,
			String pollutant, String nitrogen, String ozone, String carbon, String sulfurous, String pm10,
			String pm25) {
		super();
		this.msrDate = msrDate;
		this.msRadmCode = msRadmCode;
		this.msrStenName = msrStenName;
		this.maxIndex = maxIndex;
		this.grade = grade;
		this.pollutant = pollutant;
		this.nitrogen = nitrogen;
		this.ozone = ozone;
		this.carbon = carbon;
		this.sulfurous = sulfurous;
		this.pm10 = pm10;
		this.pm25 = pm25;
	}
	@Override
	public String toString() {
		private String msrDate; //측정날짜
		private String msRadmCode; //측정소 행정코드
		private String msrStenName; //측정소명
		private String maxIndex; //통합대기환경지수
		private String grade; //통합대기환경지수등급
		private String pollutant; //지수결정물질
		private String nitrogen; //이산화질소
		private String ozone; //오존
		private String carbon; //일산화탄소
		private String sulfurous;//아황산가스
		private String pm10; //미세먼지농도
		private String pm25; //초미세먼지농도
		return msrDate.substring(0,4)+"년 "+msrDate.substring(4, 6)+"월 "+msrDate.substring(6,8)+"일 "+msrDate.substring(8,10) + "시 " + msrDate.substring(10, 12) + "분 현재 "+msrStenName +"의 대기환경 상태는 ["
				+ grade + "]입니다\n" + "통합대기환경지수 :"+ maxIndex + "지수결정물질 :"+pollutant+
				"이산화질소 :" + nitrogen +"";
	}
	
	
	
	
}
