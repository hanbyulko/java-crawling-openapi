package kosta.mvc.model.dto;

public class CommentDTO {
	private String id;
	private String content;
	private String location;
	private String date;
	public CommentDTO(String writer, String content,String location, String date) {
		super();
		this.id = writer;
		this.content = content;
		this.location = location;
		this.date = date;
		
	}
	public CommentDTO() {
		super();
	}
	public String getWriter() {
		return id;
	}
	public void setWriter(String writer) {
		this.id = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "CommentDTO [writer=" + id + ", content=" + content + ", date=" + date + "]";
	}	
}
