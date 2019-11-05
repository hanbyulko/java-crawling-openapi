package kosta.mvc.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.mvc.model.dto.CommentDTO;

public interface CommentDAO {
	List<CommentDTO> selectAll()throws SQLException;
	//최근 댓글 5개만 리턴
	
	int insert(CommentDTO c)throws SQLException;
	
	int update(CommentDTO c)throws SQLException;
	
	int delete(CommentDTO c) throws SQLException;
}
