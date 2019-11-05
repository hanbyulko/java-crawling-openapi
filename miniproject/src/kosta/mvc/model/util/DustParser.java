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
			// 버퍼에 있는 정보를 하나의 문자열로 변환.
			while ((line = bf.readLine()) != null) {
				result = result.concat(line); //
			}
//			System.out.println(result);
			// Json parser를 만들어 만들어진 문자열 데이터를 객체화 합니다.
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject) parser.parse(result);
//			System.out.println(obj);
			// Top레벨 단계인 response 키를 가지고 데이터를 파싱합니다.
			JSONObject parse_response = (JSONObject) obj.get("ListAirQualityByDistrictService");
			System.out.println(parse_response);
			// response 로 부터 body 찾아옵니다.
			JSONArray parse_item = (JSONArray) parse_response.get("row");
			// body 로 부터 items 받아옵니다.
			System.out.println(parse_item);

			JSONObject list; // parse_item은 배열형태이기 때문에 하나씩 데이터를 하나씩 가져올때 사용합니다.
			// 필요한 데이터만 가져오려고합니다.
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
