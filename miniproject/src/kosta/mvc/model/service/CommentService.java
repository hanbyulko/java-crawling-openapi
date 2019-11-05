package kosta.mvc.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.mvc.model.dto.CommentDTO;

public interface CommentService {

	List<CommentDTO> selectAll() throws SQLException;
	//가장 최근에 등록된 5개만 보여주는걸로
	void insert(CommentDTO c) throws SQLException;
	void delete(int no) throws Exception;
	void update(CommentDTO c) throws SQLException;
}
