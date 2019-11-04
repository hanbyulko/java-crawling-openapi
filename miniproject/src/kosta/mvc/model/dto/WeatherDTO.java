package kosta.mvc.model.dto;

public class WeatherDTO {
	private String obsTm; //��������
	private String nm;  //������ 
	private double taAvg; //��ձ��
	private double taMin; //�������
	private double taMax; //�ְ���
	private double hdAvg; //��ս���
	private double hdMin; //��������
	private double hdMax; //�ְ����
	private double wsAvg; //���ǳ��
	private double wsMax; //�ִ�ǳ��
	private double rnSum; //������
	
	public WeatherDTO() {
		
	}

	public WeatherDTO(String obsTm, String nm, double taAvg, double taMin, double taMax, double hdAvg, double hdMin,
			double hdMax, double wsAvg, double wsMax, double rnSum) {
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

	public double getTaAvg() {
		return taAvg;
	}

	public void setTaAvg(double taAvg) {
		this.taAvg = taAvg;
	}

	public double getTaMin() {
		return taMin;
	}

	public void setTaMin(double taMin) {
		this.taMin = taMin;
	}

	public double getTaMax() {
		return taMax;
	}

	public void setTaMax(double taMax) {
		this.taMax = taMax;
	}

	public double getHdAvg() {
		return hdAvg;
	}

	public void setHdAvg(double hdAvg) {
		this.hdAvg = hdAvg;
	}

	public double getHdMin() {
		return hdMin;
	}

	public void setHdMin(double hdMin) {
		this.hdMin = hdMin;
	}

	public double getHdMax() {
		return hdMax;
	}

	public void setHdMax(double hdMax) {
		this.hdMax = hdMax;
	}

	public double getWsAvg() {
		return wsAvg;
	}

	public void setWsAvg(double wsAvg) {
		this.wsAvg = wsAvg;
	}

	public double getWsMax() {
		return wsMax;
	}

	public void setWsMax(double wsMax) {
		this.wsMax = wsMax;
	}

	public double getRnSum() {
		return rnSum;
	}

	public void setRnSum(double rnSum) {
		this.rnSum = rnSum;
	}

	@Override
	public String toString() {
		return "WeatherDTO [obsTm=" + obsTm + ", nm=" + nm + ", taAvg=" + taAvg + ", taMin=" + taMin + ", taMax="
				+ taMax + ", hdAvg=" + hdAvg + ", hdMin=" + hdMin + ", hdMax=" + hdMax + ", wsAvg=" + wsAvg + ", wsMax="
				+ wsMax + ", rnSum=" + rnSum + "]";
	}
	
	
	

}
