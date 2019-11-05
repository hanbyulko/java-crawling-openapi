package kosta.mvc.model.dto;

public class CommentDTO {
	private String no;
	private String writer;
	private String date;
	private String content;
	
	
	public CommentDTO() {
		super();
	}
	public CommentDTO(String no, String writer, String date, String content) {
		super();
		this.no = no;
		this.writer = writer;
		this.date = date;
		this.content = content;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
		return "CommentDTO [no=" + no + ", writer=" + writer + ", date=" + date + ", content=" + content + "]";
	}
	
}
