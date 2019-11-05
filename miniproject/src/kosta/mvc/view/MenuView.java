package kosta.mvc.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import kosta.mvc.controller.CommentController;
import kosta.mvc.controller.WeatherController;
import kosta.mvc.model.dto.CommentDTO;

public class MenuView {
	static Scanner sc = new Scanner(System.in);

	public static void menuPrint() {
		while (true) {
			System.out.println("-----메뉴 선택-----");
			System.out.println("1. 실시간 날씨 정보     2. 실시간 대기환경 정보     3. 종료");
			String select = sc.next();
			String location = null;
			
			switch (select) {
			case "1":
				System.out.println("지역을 입력하세요");
				location = sc.next();
				WeatherController.weatherSearch(location, new SimpleDateFormat("yyyyMMdd", Locale.KOREA).format(new Date()));
			case "2":
				System.out.println("지역을 입력하세요");
				location = sc.next();
				WeatherController.dustSearch(location);
				break;
			case "3":
				sc.close();
				System.exit(0);
			}
			commentMenu(location);
		}
	}
	
	public static void commentMenu(String location) {
		String select = null;
		while (true) {
			CommentController.selectLoction(location);
			System.out.println("1. 댓글 작성  2. 댓글 수정   3. 댓글 삭제   4. 이전 메뉴로");
			select = sc.next();
			String id;
			String content;
			switch (select) {
			case "1":
				System.out.println("아이디 입력");
				id = sc.next();
				System.out.println("내용 입력");
				content = sc.next();
				CommentController.insert(new CommentDTO(id, content, location, new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA).format(new Date())));
				break;
			case "2":
				System.out.println("아이디 입력");
				id = sc.next();
				System.out.println("내용 입력");
				content = sc.next();
				CommentController.update(new CommentDTO(id, content, location, new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA).format(new Date())));
				break;
			case "3":
				System.out.println("아이디 입력");
				id = sc.next();
				CommentController.delete(id);
				break;
			case "4":
				System.out.println("이전 메뉴로 돌아갑니다");
				return;
			}
		}
		
	}
}