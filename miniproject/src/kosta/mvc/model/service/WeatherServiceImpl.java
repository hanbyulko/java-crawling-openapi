package kosta.mvc.model.service;

import java.awt.Point;

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
			throw new Exception("�˻� �����Ͱ� �����ϴ�");
		}
		return dust;
	}

	@Override
	public WeatherDTO weatherSearch(Point p, String location) throws Exception {
		WeatherDTO weather = WeatherParser.jsonParser(p, location);
		if (weather == null) {
			throw new Exception("�˻� �����Ͱ� �����ϴ�");
		}
		if (weather.getNm().equals(location.substring(0, location.indexOf("��")))) {
			return weather;
		}
		return null;
	}

}
