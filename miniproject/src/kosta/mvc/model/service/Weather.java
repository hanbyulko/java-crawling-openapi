package kosta.mvc.model.service;

import java.util.List;
import java.util.Map;

import kosta.mvc.model.dto.DustDTO;
import kosta.mvc.model.dto.WeatherDTO;

public interface Weather {

	List<DustDTO> dustSearch(String location) throws Exception;

	List<WeatherDTO> weatherSearch(String location) throws Exception;
}
