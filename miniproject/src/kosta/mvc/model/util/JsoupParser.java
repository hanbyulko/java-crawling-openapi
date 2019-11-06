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

	public static Map<Integer, Article> jsoupParser() {
		String url = "http://www.hani.co.kr/arti/ISSUE/180/list1.html";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Elements elements = doc.select("div.article-area");
		Map<Integer, Article> map = new HashMap<>();
		int index = 1;
		for (Element el : elements) {
			map.put(index, new Article(index++, el.select("h4").text(), el.select("a").attr("href")));
		}
		return map;
	}

	public static String getContent(String link) {
		String url = "http://www.hani.co.kr/" + link;
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Elements elements = doc.select("div.text");
		String text = "";
		for (Element el : elements) {
			text += el.text();
		}
		String tmp = "";
		int lineSeperate = text.length()/40+1;
		int beginIndex = 0;
		int endIndex = 40;
		for (int i=0; i<lineSeperate; i++) {
			if (i==lineSeperate-1) {
				tmp += text.substring(beginIndex)+"\r\n";
				break;
			}
			tmp += text.substring(beginIndex, endIndex)+"\r\n";
			beginIndex+=40;
			endIndex+=40;
		}
		return tmp.replace(" ", "  ");
	}

	public static void main(String[] args) {
		JsoupParser.jsoupParser();
	}
}
