package kosta.mvc.controller;

import kosta.mvc.model.service.DustService;
import kosta.mvc.model.service.DustServiceImpl;
import kosta.mvc.view.FailView;
import kosta.mvc.view.SuccessView;

public class DustController {
	private static DustService service = new DustServiceImpl();

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
