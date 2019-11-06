package kosta.mvc.model.dto;

public class Article {
	private String title;
	private String url;

	public Article(String title, String url) {
		super();
		this.title = title;
		this.url = url;
	}

	@Override
	public String toString() {
		return "Article [title=" + title + ", url=" + url + "]";
	}
}
