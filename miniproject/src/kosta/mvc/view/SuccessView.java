package kosta.mvc.view;

import java.util.List;

import kosta.mvc.model.dto.DustDTO;

public class SuccessView {
	public SuccessView() {
		
	}
	
	public static void printAll(List<DustDTO> list) {
		System.out.println(list);
	}
	
	public static void selectPrint(DustDTO dust) {
		System.out.println(dust);
	}
	
	public static void messagePrint(String msg) {
		System.out.println(msg);
}
}
