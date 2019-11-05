package kosta.mvc.model.service;

import java.util.List;

import kosta.mvc.model.dto.DustDTO;
import kosta.mvc.model.dto.WeatherDTO;

public interface DustService {

	List<DustDTO> searchAll( ) throws Exception;

	DustDTO dustSearch(String location) throws Exception;

	WeatherDTO weatherSearch(String location) throws Exception;
}
