package kosta.mvc.model.service;

import java.util.List;
import java.util.Map;

import kosta.mvc.model.dto.DustDTO;
import kosta.mvc.model.dto.WeatherDTO;

public interface WeatherService {
	DustDTO dustSearch(String location) throws Exception;

	WeatherDTO weatherSearch(String date, String location) throws Exception;
}
