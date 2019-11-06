package kosta.mvc.model.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import kosta.mvc.model.dto.Article;

public class JsoupParser {
	/*
	 * Document 클래스 : 연결해서 얻어온 HTML 전체 문서 Element 클래스 : Documnet의 HTML 요소 Elements
	 * 클래스 : Element가 모인 자료형
	 */
	public static Map<Integer, Article>jsoupParser() {
		String link = "arti/ISSUE/180/list1.html";
		String url = "http://www.hani.co.kr/"+ link;
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 주요 뉴스로 나오는 태그를 찾아서 가져오도록 한다.
//		System.out.println(doc.text());
//		System.out.println(doc.html());
		Elements elements = doc.select("div.article-area");
//		// 1. 헤더 부분의 제목을 가져온다.
		Map<Integer, Article> map = new HashMap<>();
		int num = 1;
		
		for (Element el : elements) {
			map.put(num++, new Article(el.select("h4").text(),el.select("a").attr("href")));
		}
		return map;
	}
	
	public static void main(String[] args) {
		JsoupParser.jsoupParser();
	}
}
