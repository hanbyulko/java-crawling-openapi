package kosta.mvc.model.dto;

public class CommentDTO {
	private String id;
	private String content;
	private String location;
	private String date;
	public CommentDTO(String id, String content,String location, String date) {
		super();
		this.id = id;
		this.content = content;
		this.location = location;
		this.date = date;
	}
	public CommentDTO() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
		return "���̵� : " + id + "   ���� :" + content + "   �ۼ��� :" + date;
	}	
}
