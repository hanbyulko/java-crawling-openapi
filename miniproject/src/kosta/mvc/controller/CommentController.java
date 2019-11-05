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

	public static void insert(CommentDTO c) {

	}

	public static void update(CommentDTO c) {

	}

	public static void delete(String name) {

	}

}
