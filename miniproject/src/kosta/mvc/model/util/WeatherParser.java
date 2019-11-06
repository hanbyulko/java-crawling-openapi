package kosta.mvc.model.util;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import kosta.mvc.model.dto.WeatherDTO;


public class WeatherParser {
	private static final String WEATHER_KEY = "yYWI7%2BtWL7LgU05faHaW8NN7nzNK22hbRhJ0KnbgaGer%2BLfu0j4RnX1PlqAvnyW0sDSotP59SWXAMvtiFJJ49A%3D%3D";
	
	public static WeatherDTO jsonParser(Point p) {
		String date;
		date = new SimpleDateFormat("yyyyMMdd", Locale.KOREA).format(new Date());
		BufferedReader bf = null;
		try { 
			String urlStr = "http://newsky2.kma.go.kr/service/SecndSrtpdFrcstInfoService2/ForecastSpaceData?serviceKey=" + WEATHER_KEY
					+ "&base_date="+date+"&base_time=0500&nx="+(int)p.getX()+"&ny="+(int)p.getY()+"&_type=json";
			URL url = new URL(urlStr);
			String line = "";
			String result = ""; // 날씨 정보를 받아옵니다.
			bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			
			while ((line = bf.readLine()) != null) {
				result = result.concat(line); 	
			}
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject) parser.parse(result);
			JSONObject parse_response = (JSONObject) obj.get("response");
			JSONObject parse_body = (JSONObject) parse_response.get("body");
			JSONObject parse_items = (JSONObject) parse_body.get("items");
			JSONArray parse_item = (JSONArray) parse_items.get("item");
			JSONObject weather; 
			int size = parse_item.size();
			String[] arr = new String[size];
			for (int i = 0; i < size; i++) {
				weather = (JSONObject) parse_item.get(i);
				arr[i] = String.valueOf(weather.get("fcstValue"));
			}
			return new WeatherDTO(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
