package kosta.mvc.model.dto;

public class WeatherDTO {
	private String obsTm; //��������
	private String nm;  //������ 
	private String taAvg; //��ձ��
	private String taMin; //�������
	private String taMax; //�ְ���
	private String hdAvg; //��ս���
	private String hdMin; //��������
	private String hdMax; //�ְ����
	private String wsAvg; //���ǳ��
	private String wsMax; //�ִ�ǳ��
	private String rnSum; //������
	
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
		return obsTm.substring(0,4)+"�� "+obsTm.substring(4, 6)+"�� "+obsTm.substring(6,8)+"�� ["+ nm + "]�� ���� ����" +
				"\n��ձ�� :"+ taAvg + "\n������� :"+taMin+
				"\n�ְ��� :" + taMax +"\n��ս��� :"+hdAvg + "\n�������� :"+hdMin + 
				"\n�ְ���� :" + hdMax + "\n���ǳ��" + wsAvg + "\n�ִ�ǳ��" +wsMax + "\n������" + rnSum;
	}
}
