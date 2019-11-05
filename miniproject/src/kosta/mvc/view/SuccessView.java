package kosta.mvc.view;

import java.util.List;
import java.util.Map;

import kosta.mvc.model.dto.DustDTO;
import kosta.mvc.model.dto.WeatherDTO;

public class SuccessView {
	public SuccessView() {
	}
	
	public static void printAll(Map<List<DustDTO>, List<WeatherDTO>> map) {
		System.out.println(map);
	}
	
	public static void selectPrint(Object obj) {
		System.out.println(obj);
	}
	
	public static void messagePrint(String msg) {
		System.out.println(msg);
}
}
