package kosta.mvc.model.service;

import java.util.List;
import java.util.Map;

import kosta.mvc.model.dto.DustDTO;
import kosta.mvc.model.dto.WeatherDTO;
import kosta.mvc.model.util.DustParser;
import kosta.mvc.model.util.WeatherParser;

public class WeatherServiceImpl implements Weather {
	
	@Override
	public List<DustDTO> dustSearch(String location) throws Exception{
		return DustParser.jsonParser(location);
	}

	@Override
	public List<WeatherDTO> weatherSearch(String location) throws Exception {
		return WeatherParser.jsonParser(location);
	}
	
}
