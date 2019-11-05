package kosta.mvc.model.service;

import kosta.mvc.model.dto.CommentDTO;

public interface CommentService {

	void selectAll() throws Exception;
	//가장 최근에 등록된 10개만 보여주는걸로
	void insert(CommentDTO c) throws Exception;
	void delete(CommentDTO c) throws Exception;
	void update(CommentDTO c) throws Exception;
}
