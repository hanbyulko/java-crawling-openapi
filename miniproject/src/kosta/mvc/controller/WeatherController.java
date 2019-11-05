package kosta.mvc.controller;

import kosta.mvc.model.service.Weather;
import kosta.mvc.model.service.WeatherServiceImpl;
import kosta.mvc.view.FailView;
import kosta.mvc.view.SuccessView;

public class WeatherController {
	private static Weather service = new WeatherServiceImpl();

	public static void searchAll() {
		try {
			SuccessView.printAll(service.searchAll());
		} catch (Exception e) {
			FailView.errorMessage(e.getMessage());
		}
	}

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
}
