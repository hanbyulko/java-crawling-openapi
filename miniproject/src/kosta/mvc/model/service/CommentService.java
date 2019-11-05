package kosta.mvc.model.service;

import kosta.mvc.model.dto.CommentDTO;

public interface CommentService {

	void selectAll() throws Exception;
	//���� �ֱٿ� ��ϵ� 10���� �����ִ°ɷ�
	void insert(CommentDTO c) throws Exception;
	void delete(CommentDTO c) throws Exception;
	void update(CommentDTO c) throws Exception;
}
