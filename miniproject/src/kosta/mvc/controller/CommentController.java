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

	//id�ߺ�üũ
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
			SuccessView.messagePrint("���ԵǾ����ϴ�.");
		} catch (SQLException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	public static void update(CommentDTO c) {
		try {
			service.update(c);
			SuccessView.messagePrint("�����Ǿ����ϴ�.");
		} catch (SQLException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	public static void delete(String id) {
		try {
			service.delete(id);
			SuccessView.messagePrint("�����Ǿ����ϴ�.");
		} catch (Exception e) { //SQLException�ϸ� ������ ���µ� �� ������ �𸣰ڽ��ϴ� �̤�
			FailView.errorMessage(e.getMessage());
		}
	}

}
