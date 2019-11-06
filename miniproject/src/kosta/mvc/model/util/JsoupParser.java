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
	 * Document Ŭ���� : �����ؼ� ���� HTML ��ü ���� Element Ŭ���� : Documnet�� HTML ��� Elements
	 * Ŭ���� : Element�� ���� �ڷ���
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
		// �ֿ� ������ ������ �±׸� ã�Ƽ� ���������� �Ѵ�.
//		System.out.println(doc.text());
//		System.out.println(doc.html());
		Elements elements = doc.select("div.article-area");
//		// 1. ��� �κ��� ������ �����´�.
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
