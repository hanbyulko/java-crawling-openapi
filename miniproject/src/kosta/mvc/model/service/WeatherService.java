package kosta.mvc.model.service;

import java.util.Map;

import kosta.mvc.model.dto.Article;
import kosta.mvc.model.dto.DustDTO;
import kosta.mvc.model.dto.WeatherDTO;

public interface WeatherService {
	DustDTO dustSearch(String location) throws Exception;

	WeatherDTO weatherSearch(String location) throws Exception;

	Map<Integer, Article> articleSearch() throws Exception;

	String articleContent(String link) throws Exception;
}
