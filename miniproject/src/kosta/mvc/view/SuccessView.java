package kosta.mvc.view;

import java.util.List;

import kosta.mvc.model.dto.DustDTO;

public class SuccessView {
	public SuccessView() {
		
	}
	
	public static void printAll(List<DustDTO> list) {
		System.out.println(list);
	}
	
	public static void selectPrint(Object obj) {
		System.out.println(obj);
	}
	
	public static void messagePrint(String msg) {
		System.out.println(msg);
}
}
