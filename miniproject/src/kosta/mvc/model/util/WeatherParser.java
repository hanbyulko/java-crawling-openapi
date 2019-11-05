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
import kosta.mvc.model.dto.WeatherDTO;

public class WeatherParser {
	private static final String WEATHER_KEY = "5479724c5068616e3738755144574b";

	/*
	 * http://openAPI.seoul.go.kr:8088/5574536c6a68616e38306d6d726e53/json/DailyWeatherStation/1/5/201302
	 * private String obsTm; //관측일자 private String nm; //지점명 private String taAvg;
	 * //평균기온 private String taMin; //최저기온 private String taMax; //최고기온 private
	 * String hdAvg; //평균습도 private String hdMin; //최저습도 private String hdMax;
	 * //최고습도 private String wsAvg; //평균풍속 private String wsMax; //최대풍속 private
	 * String rnSum; //강수량
	 */
	public static List<WeatherDTO> jsonParser(String date) {
		List<WeatherDTO> weatherList = new ArrayList<>();
		BufferedReader bf = null;
		try { 

			String urlStr = "http://openAPI.seoul.go.kr:8088/" + WEATHER_KEY
					+ "/json/DailyWeatherStation/1/5/" + date;
			
		
			
			URL url = new URL(urlStr);
			String line = "";
			String result = ""; // 날씨 정보를 받아옵니다.
			bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

			while ((line = bf.readLine()) != null) {
				result = result.concat(line); 
			}
			//System.out.println(result);
			
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject) parser.parse(result);
			//System.out.println(obj);
			
			JSONObject parse_response = (JSONObject) obj.get("DailyWeatherStation");
			//System.out.println(parse_response);
			
			JSONArray parse_item = (JSONArray) parse_response.get("row");
			//System.out.println(parse_item);
			
			JSONObject weather; 
			for (int i = 0; i < parse_item.size(); i++) {
				weather = (JSONObject) parse_item.get(i);
				String SAWS_OBS_TM = (String) weather.get("SAWS_OBS_TM");
				String STN_NM = (String) weather.get("STN_NM");
				String SAWS_TA_AVG = String.valueOf(weather.get("SAWS_TA_AVG")) ;
				String SAWS_TA_MIN = String.valueOf( weather.get("SAWS_TA_MIN"));
				String SAWS_TA_MAX = String.valueOf( weather.get("SAWS_TA_MAX"));
				String SAWS_HD_AVG = String.valueOf( weather.get("SAWS_HD_AVG"));
				String SAWS_HD_MIN = String.valueOf( weather.get("SAWS_HD_MIN"));
				String SAWS_HD_MAX = String.valueOf( weather.get("SAWS_HD_MAX"));
				String SAWS_WS_AVG = String.valueOf( weather.get("SAWS_WS_AVG"));
				String SAWS_WS_MAX = String.valueOf( weather.get("SAWS_WS_MAX"));
				String SAWS_RN_SUM = String.valueOf( weather.get("SAWS_RN_SUM"));
				weatherList.add(new WeatherDTO(SAWS_OBS_TM, STN_NM, SAWS_TA_AVG, SAWS_TA_MIN, SAWS_TA_MAX, SAWS_HD_AVG, SAWS_HD_MIN, SAWS_HD_MAX,
						SAWS_WS_AVG, SAWS_WS_MAX, SAWS_RN_SUM));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return weatherList;
	}
	
	public static void main(String[] args) {
		
		System.out.println(jsonParser("20180317"));
	}
}
