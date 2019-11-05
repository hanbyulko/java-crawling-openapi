package kosta.mvc.model.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import kosta.mvc.model.dto.DustDTO;
import kosta.mvc.model.dto.WeatherDTO;

public class WeatherParser {
	private static final String WEATHER_KEY = "5479724c5068616e3738755144574b";

	/*
	 * http://openAPI.seoul.go.kr:8088/5574536c6a68616e38306d6d726e53/json/DailyWeatherStation/1/5/201302
	 * private String obsTm; //�������� private String nm; //������ private String taAvg;
	 * //��ձ�� private String taMin; //������� private String taMax; //�ְ��� private
	 * String hdAvg; //��ս��� private String hdMin; //�������� private String hdMax;
	 * //�ְ���� private String wsAvg; //���ǳ�� private String wsMax; //�ִ�ǳ�� private
	 * String rnSum; //������
	 */
	public static List<WeatherDTO> jsonParser(String location) {
		List<WeatherDTO> weatherList = new ArrayList<>();
		BufferedReader bf = null;
		try { /*
				 * ��û�����Է� * �Ʒ��� ���� �������� ����� ���̵带 Ȯ���Ͽ� ã���ֽø� �˴ϴ�. ���� �浵�� �������� �ȿ� �ֽ��ϴ�. *
				 */

			// �� ������ "&_type=json"�� ���� ��ȯ �������� ���°� �������ϴ�.
			String urlStr = "http://openAPI.seoul.go.kr:8088/" + WEATHER_KEY
					+ "/json/ListAirQualityByDistrictService/1/5/" + location;
			URL url = new URL(urlStr);
			// �� urlStr�� �̿��ؼ� URL ��ü�� ������ݴϴ�.
			String line = "";
			String result = ""; // ���� ������ �޾ƿɴϴ�.
			bf = new BufferedReader(new InputStreamReader(url.openStream()));
			// ���ۿ� �ִ� ������ �ϳ��� ���ڿ��� ��ȯ.

			while ((line = bf.readLine()) != null) {
				result = result.concat(line); //
			}

			System.out.println(result);
			// �޾ƿ� �����͸� Ȯ���غ��ϴ�. }
			// Json parser�� ����� ������� ���ڿ� �����͸� ��üȭ �մϴ�.
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject) parser.parse(result);
			// Top���� �ܰ��� response Ű�� ������ �����͸� �Ľ��մϴ�.
			JSONObject parse_response = (JSONObject) obj.get("ListAirQualityByDistrictService");
			System.out.println(parse_response);
			// response �� ���� body ã�ƿɴϴ�.
			JSONObject parse_body = (JSONObject) parse_response.get("body");
			// body �� ���� items �޾ƿɴϴ�.
			JSONObject parse_items = (JSONObject) parse_body.get("items");
			// items�� ���� itemlist �� �޾ƿ��� itemlist : �ڿ� [ �� �����ϹǷ� jsonarray�̴�
			JSONArray parse_item = (JSONArray) parse_items.get("item");
			String category;
			JSONObject dust; // parse_item�� �迭�����̱� ������ �ϳ��� �����͸� �ϳ��� �����ö� ����մϴ�.
			// �ʿ��� �����͸� �����������մϴ�.
			for (int i = 0; i < parse_item.size(); i++) {
				dust = (JSONObject) parse_item.get(i);
				//
				String base_Date = (String) dust.get("baseDate");
				//
				String fcst_Time = (String) dust.get("fcstDate");
				double fcst_Value = ((Long) dust.get("fcstValue")).doubleValue();
				// �Ǽ��ε� ���� �����ε� ���� �Ѵ� �־ �Ǽ��� �����߽��ϴ�. //
				String nX = (String) dust.get("nx"); //
				String nY = (String) dust.get("ny");
				category = (String) dust.get("category"); //
				String base_Time = (String) dust.get("baseTime"); //
				String fcscDate = (String) dust.get("fcscDate"); // ����մϴ�.
				System.out.print("�迭�� " + i + "��° ���");
				System.out.print(" category : " + category);
				System.out.print(" fcst_Value : " + fcst_Value);
				System.out.println();
			}
			// ������������ ������ �߻��Ͽ��µ� casting�����Դϴ�.
			// �̴� ��ȯ�Ǵ� ������Ÿ���� �޶��ε� �̹� �ۿ����� ����������ϰ�
			// �����ͺ��̽��� �Է��Ҷ��� �����ؼ� �ϰڽ��ϴ�.
			bf.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return weatherList;
	}

}
