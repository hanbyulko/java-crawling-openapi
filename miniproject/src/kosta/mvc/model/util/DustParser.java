package kosta.mvc.model.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import kosta.mvc.model.dto.DustDTO;

public class DustParser {
	private static final String DUST_KEY = "5574536c6a68616e38306d6d726e53";

	public static List<DustDTO> jsonParser(String location) {
		List<DustDTO> dustList = new ArrayList<>();
		BufferedReader bf = null;
		try {
			
			
			String urlStr = "http://openAPI.seoul.go.kr:8088/" + DUST_KEY + "/json/ListAirQualityByDistrictService/1/5/"
					+ location;
			URL url = new URL(urlStr);

			String line = "";
			String result = "";
			bf = new BufferedReader(new InputStreamReader(url.openStream()));
			// ���ۿ� �ִ� ������ �ϳ��� ���ڿ��� ��ȯ.
			while ((line = bf.readLine()) != null) {
				result = result.concat(line); //
			}
//			System.out.println(result);
			// Json parser�� ����� ������� ���ڿ� �����͸� ��üȭ �մϴ�.
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject) parser.parse(result);
//			System.out.println(obj);
			// Top���� �ܰ��� response Ű�� ������ �����͸� �Ľ��մϴ�.
			JSONObject parse_response = (JSONObject) obj.get("ListAirQualityByDistrictService");
			System.out.println(parse_response);
			// response �� ���� body ã�ƿɴϴ�.
			JSONArray parse_item = (JSONArray) parse_response.get("row");
			// body �� ���� items �޾ƿɴϴ�.
			System.out.println(parse_item);

			JSONObject list; // parse_item�� �迭�����̱� ������ �ϳ��� �����͸� �ϳ��� �����ö� ����մϴ�.
			// �ʿ��� �����͸� �����������մϴ�.
			for (int i = 0; i < parse_item.size(); i++) {
				list = (JSONObject) parse_item.get(i);
				String msrDate = (String) list.get("MSRDATE");
				String msrAdmCode = (String) list.get("MSRADMCODE");
				String msrStenName = (String) list.get("MSRSTENNAME");
				String maxIndex = (String) list.get("MAXINDEX");
				String grade = (String) list.get("GRADE");
				String pollutant = (String) list.get("POLLUTANT");
				String nitrogen = (String) list.get("NITROGEN");
				String ozone = (String) list.get("OZONE");
				String carbon = (String) list.get("CARBON");
				String sulfurous = (String) list.get("SULFUROUS");
				String pm10 = (String) list.get("PM10");
				String pm25 = (String) list.get("PM25");
				dustList.add(new DustDTO(msrDate, msrAdmCode, msrStenName, maxIndex, grade, pollutant, nitrogen, ozone,
						carbon, sulfurous, pm10, pm25));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return dustList;
	}
	public static void main(String[] args) {
		
		System.out.println(jsonParser(""));
	}
}
