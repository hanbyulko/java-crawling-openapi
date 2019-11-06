package kosta.mvc.model.service;

import kosta.mvc.model.dto.DustDTO;
import kosta.mvc.model.dto.WeatherDTO;
import kosta.mvc.model.util.DustParser;
import kosta.mvc.model.util.LocationCode;
import kosta.mvc.model.util.WeatherParser;

public class WeatherServiceImpl implements WeatherService {

	@Override
	public DustDTO dustSearch(String location) throws Exception {
		DustDTO dust = DustParser.jsonParser(LocationCode.getCode(location));
		if (dust == null) {
			throw new Exception("검색 데이터가 없습니다");
		}
		return dust;
	}

	@Override
	public WeatherDTO weatherSearch(String location) throws Exception {
		WeatherDTO weather = WeatherParser.jsonParser(LocationCode.getPoint(location));
		if (weather == null) {
			throw new Exception("검색 데이터가 없습니다");
		}
		return weather;
	}

}
