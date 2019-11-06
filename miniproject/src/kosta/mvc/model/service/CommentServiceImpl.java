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
			throw new SQLException("검색된 댓글이 없습니다");
		}
		return list;
	}

	@Override
	public boolean getCheckById(String id) throws SQLException {
		return dao.getCheckById(id);
	}

	
	@Override
	public void insert(CommentDTO c) throws SQLException {
		int result = dao.insert(c);
		if(result == 0) {
			throw new SQLException("삽입실패");
		}
	}

	@Override
	public void delete(String id) throws SQLException {
		int result = dao.delete(id);
		if(result == 0) {
			throw new SQLException("삭제실패");
		}
		
	}

	@Override
	public void update(CommentDTO c) throws SQLException {
		int result = dao.update(c);
		if(result == 0) {
			throw new SQLException("수정실패");
		}
	}

	
	

}
