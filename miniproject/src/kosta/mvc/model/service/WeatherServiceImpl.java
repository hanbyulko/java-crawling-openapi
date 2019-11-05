package kosta.mvc.model.service;

import java.util.List;
import java.util.Map;

import kosta.mvc.model.dto.DustDTO;
import kosta.mvc.model.dto.WeatherDTO;
import kosta.mvc.model.util.DustParser;
import kosta.mvc.model.util.LocationCode;
import kosta.mvc.model.util.WeatherParser;

public class WeatherServiceImpl implements WeatherService {
	
	@Override
	public DustDTO dustSearch(String location) throws Exception{
		DustDTO dust = DustParser.jsonParser(LocationCode.getCode(location));
		if (dust==null) {
			throw new Exception("검색 데이터가 없습니다");
		}
		return dust;
	}

	@Override
	public WeatherDTO weatherSearch(String date, String location) throws Exception {
		List<WeatherDTO> list = WeatherParser.jsonParser(date);
		if (list==null) {
			throw new Exception("검색 데이터가 없습니다");
		}
		int size = list.size();
		for (int i=0; i<size; i++) {
			if (list.get(i).getNm().equals(location.substring(0, location.indexOf("구")))) {
				return list.get(i);
			}
		}
		return null;
	}
	
	
}
