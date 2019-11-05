package kosta.mvc.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.mvc.model.dao.CommentDAO;
import kosta.mvc.model.dao.CommentDAOImpl;
import kosta.mvc.model.dto.CommentDTO;

public class CommentServiceImpl implements CommentService {
	private static CommentDAO dao = new CommentDAOImpl();

	@Override
	public List<CommentDTO> selectLocation(String location) throws SQLException {
		List<CommentDTO> list = dao.selectLocation(location);
		if(list==null || list.isEmpty()) {
			throw new SQLException("�˻��� ����� �����ϴ�");
		}
		return list;
	}

	@Override
	public void insert(CommentDTO c) throws SQLException {
		int result = dao.insert(c);
		if(result == 0) {
			throw new SQLException("���Խ���");
		}
	}

	@Override
	public void delete(int no) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CommentDTO c) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	

}
