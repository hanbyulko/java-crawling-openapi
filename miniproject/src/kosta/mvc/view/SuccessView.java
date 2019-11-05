package kosta.mvc.view;

import java.util.List;
import java.util.Map;

import kosta.mvc.model.dto.CommentDTO;
import kosta.mvc.model.dto.DustDTO;
import kosta.mvc.model.dto.WeatherDTO;

public class SuccessView {
	
	public SuccessView() {
	}
	
	public static void selectAll(List<CommentDTO> list) {
		for( CommentDTO dto : list) {
			System.out.println(dto);
		}
	}
	
	public static void selectPrint(Object obj) {
		System.out.println(obj);
	}
	
	public static void messagePrint(String msg) {
		System.out.println(msg);
}
}
