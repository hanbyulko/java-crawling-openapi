package kosta.mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kosta.mvc.model.dto.CommentDTO;
import kosta.mvc.model.util.DbUtil;

public class CommentDAOImpl implements CommentDAO{
	
	
	@Override
	public List<CommentDTO> selectLocation(String location) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CommentDTO> list = new ArrayList<CommentDTO>();
		String sql = "select id,content,regdate from COMMENTS where location = ?";
		try {
			conn = DbUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, location);
			rs = ps.executeQuery();
			while(rs.next()) {
				CommentDTO dto = new CommentDTO(rs.getString(1), rs.getString(2), rs.getString(3));
				list.add(dto);
			}
		}finally {
			DbUtil.dbClose(conn, ps, rs);
		}
		return list;
	}

	@Override
	public int insert(CommentDTO c) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CommentDTO c) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(CommentDTO c) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
