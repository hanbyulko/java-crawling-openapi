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
		String sql = "select id,content,location, regdate from COMMENTS where location = ?";
		try {
			conn = DbUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, location);
			rs = ps.executeQuery();
			while(rs.next()) {
				CommentDTO dto = new CommentDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				list.add(dto);
			}
		}finally {
			DbUtil.dbClose(conn, ps, rs);
		}
		return list;
	}

	@Override
	public boolean getCheckById(String id) throws SQLException {//id 중복체크 true이면 중복, false이면 중복아님
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select id from comments where upper(id) = upper(?)";
		boolean result = false;
		try {
			conn = DbUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, id.trim());//trim권장(공백 없애기 위해)
			rs = ps.executeQuery();
			if(rs.next()) {
				result = true;
			}
		}finally {
			DbUtil.dbClose(conn, ps, rs);
		}return result;
	}
	
	@Override
	public int insert(CommentDTO c) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into comments(id,content,location,regdate) values(?,?,?,?)";
		try {
			conn = DbUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, c.getId());
			ps.setString(2, c.getContent());
			ps.setString(3, c.getLocation());
			ps.setString(4, c.getDate());
			result = ps.executeUpdate();
		}finally {
			DbUtil.dbClose(conn, ps);
		}
		return result;
	}

	@Override
	public int update(CommentDTO c) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "update comments set content=?,location=?,regdate=? where id=?";
		try {
			conn = DbUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, c.getContent());
			ps.setString(2, c.getLocation());
			ps.setString(3, c.getDate());
			ps.setString(4, c.getId());
			result = ps.executeUpdate();
		}finally {
			DbUtil.dbClose(conn, ps);
		}
		return result;
	}

	@Override
	public int delete(String id) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "delete from comments where id=?";
		try {
			conn = DbUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			result = ps.executeUpdate();
		}finally {
			DbUtil.dbClose(conn, ps);
		}
		return result;
	}	
}
