package kosta.mvc.view;

import java.util.List;
import java.util.Map;
import java.util.Set;

import kosta.mvc.model.dto.Article;
import kosta.mvc.model.dto.CommentDTO;

public class SuccessView {

	public SuccessView() {
	}

	public static void selectAll(List<CommentDTO> list) {
		for (CommentDTO dto : list) {
			System.out.println(dto);
		}
	}

	public static void selectPrint(Object obj) {
		System.out.println(obj);
	}
	
	public static void printArticle(Map<Integer, Article> map) {
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			Article tmp = map.get(key);
			System.out.println(tmp.getNum()+ " | " + tmp.getTitle());
		}
	}

	public static void messagePrint(String msg) {
		System.out.println(msg);
	}
}
