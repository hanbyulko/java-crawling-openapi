package kosta.mvc.model.dto;

public class CommentDTO {
	private String writer;
	private String date;
	private String content;
	public CommentDTO(String writer, String date, String content) {
		super();
		this.writer = writer;
		this.date = date;
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "CommentDTO [writer=" + writer + ", date=" + date + ", content=" + content + "]";
	}
}
