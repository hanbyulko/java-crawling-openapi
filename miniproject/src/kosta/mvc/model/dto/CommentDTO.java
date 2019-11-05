package kosta.mvc.model.dto;

public class CommentDTO {
	private String code;
	private String writer;
	private String date;
	private String content;
	
	
	public CommentDTO() {
		super();
	}
	public CommentDTO(String no, String writer, String date, String content) {
		super();
		this.code = no;
		this.writer = writer;
		this.date = date;
		this.content = content;
	}
	public String getNo() {
		return code;
	}
	public void setNo(String no) {
		this.code = no;
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
		return "CommentDTO [no=" + code + ", writer=" + writer + ", date=" + date + ", content=" + content + "]";
	}
	
}
