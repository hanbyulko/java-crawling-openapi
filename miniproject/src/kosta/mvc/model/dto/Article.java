package kosta.mvc.model.dto;

public class Article {
	private Integer num;
	private String title;
	private String url;
	public Article(Integer num, String title, String url) {
		super();
		this.num = num;
		this.title = title;
		this.url = url;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Article [num=" + num + ", title=" + title + ", url=" + url + "]";
	}

	
}
