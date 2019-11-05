package kosta.mvc.model.dto;

public class DustDTO {
	private String msrDate; //������¥
	private String msRadmCode; //������ �����ڵ�
	private String msrStenName; //�����Ҹ�
	private String maxIndex; //���մ��ȯ������
	private String grade; //���մ��ȯ���������
	private String pollutant; //������������
	private String nitrogen; //�̻�ȭ����
	private String ozone; //����
	private String carbon; //�ϻ�ȭź��
	private String sulfurous;//��Ȳ�갡��
	private String pm10; //�̼�������
	private String pm25; //�ʹ̼�������
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
		private String msrDate; //������¥
		private String msRadmCode; //������ �����ڵ�
		private String msrStenName; //�����Ҹ�
		private String maxIndex; //���մ��ȯ������
		private String grade; //���մ��ȯ���������
		private String pollutant; //������������
		private String nitrogen; //�̻�ȭ����
		private String ozone; //����
		private String carbon; //�ϻ�ȭź��
		private String sulfurous;//��Ȳ�갡��
		private String pm10; //�̼�������
		private String pm25; //�ʹ̼�������
		return msrDate.substring(0,4)+"�� "+msrDate.substring(4, 6)+"�� "+msrDate.substring(6,8)+"�� "+msrDate.substring(8,10) + "�� " + msrDate.substring(10, 12) + "�� ���� "+msrStenName +"�� ���ȯ�� ���´� ["
				+ grade + "]�Դϴ�\n" + "���մ��ȯ������ :"+ maxIndex + "������������ :"+pollutant+
				"�̻�ȭ���� :" + nitrogen +"";
	}
	
	
	
	
}
