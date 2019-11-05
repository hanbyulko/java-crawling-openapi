package kosta.mvc.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.mvc.model.dto.CommentDTO;

public interface CommentService {

	List<CommentDTO> selectAll() throws SQLException;
	//���� �ֱٿ� ��ϵ� 5���� �����ִ°ɷ�
	void insert(CommentDTO c) throws SQLException;
	void delete(int no) throws Exception;
	void update(CommentDTO c) throws SQLException;
}
