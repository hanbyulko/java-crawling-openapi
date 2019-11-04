package kosta.mvc.controller;

import kosta.mvc.model.service.DustService;
import kosta.mvc.model.service.DustServiceImpl;
import kosta.mvc.model.util.LocationUtil;
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

	public static void search(String location) {
		try {
			SuccessView.selectPrint(service.search(location));
		} catch (Exception e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	public static void currentLocation() {
		try {
			SuccessView.selectPrint(service.search(LocationUtil.getLocation()));
		} catch (Exception e) {
			FailView.errorMessage(e.getMessage());
		}
	}
}
