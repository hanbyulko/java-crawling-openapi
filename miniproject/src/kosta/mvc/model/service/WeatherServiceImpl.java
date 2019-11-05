package kosta.mvc.model.service;

import java.util.List;

import kosta.mvc.model.dto.DustDTO;
import kosta.mvc.model.dto.WeatherDTO;
import kosta.mvc.model.util.DustParser;
import kosta.mvc.model.util.WeatherParser;

public class WeatherServiceImpl implements Weather {
	@Override
	public List<DustDTO> searchAll() throws Exception{
		List<DustDTO> list = null;
		return list;
	}

	@Override
	public DustDTO dustSearch(String location) throws Exception{
		return DustParser.jsonParser(location);
	}

	@Override
	public WeatherDTO weatherSearch(String location) throws Exception {
		return WeatherParser.jsonParser(location);
	}
	
}
