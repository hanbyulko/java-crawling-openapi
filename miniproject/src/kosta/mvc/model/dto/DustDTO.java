package kosta.mvc.model.dto;

public class DustDTO {
	private String msrDate; //측정날짜
	private String msRadmCode; //측정소 행정코드
	private String msrStenName; //측정소명
	private String maxIndex; //통합대기환경지수
	private int grade; //통합대기환경지수등급
	private String pollutant; //지수결정물질
	private double nitrogen; //이산화질소
	private double ozone; //오존
	private double carbon; //일산화탄소
	private double sulfurous;//아황산가스
	private int pm10; //미세먼지농도
	private int pm25; //초미세먼지농도
	
	public DustDTO() {
		
	}
	
	
	public DustDTO(String msrDate, String msRadmCode, String msrStenName, String maxIndex, int grade, String pollutant,
			double nitrogen, double ozone, double carbon, double sulfurous, int pm10, int pm25) {
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


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public String getPollutant() {
		return pollutant;
	}


	public void setPollutant(String pollutant) {
		this.pollutant = pollutant;
	}


	public double getNitrogen() {
		return nitrogen;
	}


	public void setNitrogen(double nitrogen) {
		this.nitrogen = nitrogen;
	}


	public double getOzone() {
		return ozone;
	}


	public void setOzone(double ozone) {
		this.ozone = ozone;
	}


	public double getCarbon() {
		return carbon;
	}


	public void setCarbon(double carbon) {
		this.carbon = carbon;
	}


	public double getSulfurous() {
		return sulfurous;
	}


	public void setSulfurous(double sulfurous) {
		this.sulfurous = sulfurous;
	}


	public int getPm10() {
		return pm10;
	}


	public void setPm10(int pm10) {
		this.pm10 = pm10;
	}


	public int getPm25() {
		return pm25;
	}


	public void setPm25(int pm25) {
		this.pm25 = pm25;
	}


	@Override
	public String toString() {
		return "DustDTO [msrDate=" + msrDate + ", msRadmCode=" + msRadmCode + ", msrStenName=" + msrStenName
				+ ", maxIndex=" + maxIndex + ", grade=" + grade + ", pollutant=" + pollutant + ", nitrogen=" + nitrogen
				+ ", ozone=" + ozone + ", carbon=" + carbon + ", sulfurous=" + sulfurous + ", pm10=" + pm10 + ", pm25="
				+ pm25 + "]";
	}
	
}
