package kosta.mvc.controller;

import kosta.mvc.model.service.WeatherService;
import kosta.mvc.model.service.WeatherServiceImpl;
import kosta.mvc.model.util.LocationCode;
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

	public static void weatherSearch(String date, String location) {
		try {
			SuccessView.selectPrint(service.weatherSearch(date, location));
		} catch (Exception e) {
			FailView.errorMessage(e.getMessage());
		}
	}
}
