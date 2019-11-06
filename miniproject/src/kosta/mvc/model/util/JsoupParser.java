package kosta.mvc.model.util;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupParser {
	/*
	 * Document Ŭ���� : �����ؼ� ���� HTML ��ü ���� Element Ŭ���� : Documnet�� HTML ��� Elements
	 * Ŭ���� : Element�� ���� �ڷ���
	 */
	public static void main(String[] args) {
		String url = "http://www.hani.co.kr/arti/ISSUE/180/list1.html";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// �ֿ� ������ ������ �±׸� ã�Ƽ� ���������� �Ѵ�.
//		System.out.println(doc.text());
//		System.out.println(doc.html());
		Elements element = doc.select("div.article-area");
//		// 1. ��� �κ��� ������ �����´�.
		String title = element.select("h4").html();
		System.out.println(title);
		
//		System.out.println("============================================================");
//		System.out.println(title);
//		System.out.println("============================================================");
		for (Element el : element.select("a href")) { // ���� ���� ������ for�� ���鼭 ���
			System.out.println(el.text());
		}
		
//		System.out.println("============================================================");
	}
}
