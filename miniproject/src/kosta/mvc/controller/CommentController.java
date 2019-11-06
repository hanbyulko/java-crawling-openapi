package kosta.mvc.controller;

import java.sql.SQLException;
import java.util.List;

import kosta.mvc.model.dto.CommentDTO;
import kosta.mvc.model.service.CommentServiceImpl;
import kosta.mvc.view.FailView;
import kosta.mvc.view.SuccessView;

public class CommentController {
	static CommentServiceImpl service = new CommentServiceImpl();
	

	public static void selectLoction(String location) {
		try {
			List<CommentDTO> list = service.selectLocation(location);
			SuccessView.selectAll(list);
		} catch (SQLException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	//id중복체크
	public static boolean getCheckById(String id) {
		boolean result = true;
		try {
			 result = service.getCheckById(id);
		}catch(SQLException e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}
		return result;
	}
	
	public static void insert(CommentDTO c) {
		try {
			service.insert(c);
			SuccessView.messagePrint("삽입되었습니다.");
		} catch (SQLException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	public static void update(CommentDTO c) {
		try {
			service.update(c);
			SuccessView.messagePrint("수정되었습니다.");
		} catch (SQLException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	public static void delete(String id) {
		try {
			service.delete(id);
			SuccessView.messagePrint("삭제되었습니다.");
		} catch (Exception e) { //SQLException하면 오류가 나는데 왜 나는지 모르겠습니다 ㅜㅜ
			FailView.errorMessage(e.getMessage());
		}
	}

}
