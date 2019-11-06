package kosta.mvc.controller;

import java.util.Map;

import kosta.mvc.model.dto.Article;
import kosta.mvc.model.dto.WeatherDTO;
import kosta.mvc.model.service.WeatherService;
import kosta.mvc.model.service.WeatherServiceImpl;
import kosta.mvc.view.FailView;
import kosta.mvc.view.SuccessView;

public class WeatherController {
	private static WeatherService service = new WeatherServiceImpl();

	public static void dustSearch(String location) {
		try {
			SuccessView.selectPrint(service.dustSearch(location));
		} catch (Exception e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	public static void weatherSearch(String location) {
		try {
			SuccessView.selectPrint(service.weatherSearch(location));
		} catch (Exception e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	public static Map<Integer, Article> articleSearch() {
		Map<Integer, Article> map = null;
		try {
			map = service.articleSearch();
			SuccessView.printArticle(map);
		} catch (Exception e) {
			FailView.errorMessage(e.getMessage());
		}
		return map;
	}
	
	public static void articleContent(String link) {
		try {
			SuccessView.selectPrint(service.articleContent(link));
		} catch (Exception e) {
			FailView.errorMessage(e.getMessage());
		}
	}
}
