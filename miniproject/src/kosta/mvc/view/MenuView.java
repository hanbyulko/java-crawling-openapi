package kosta.mvc.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import kosta.mvc.controller.CommentController;
import kosta.mvc.controller.WeatherController;
import kosta.mvc.model.dto.Article;
import kosta.mvc.model.dto.CommentDTO;

public class MenuView {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void menuPrint() throws IOException {
		while (true) {
			System.out.println("-----메뉴 선택-----");
			System.out.println("1. 실시간 날씨 정보     2. 실시간 대기환경 정보     3. 미세먼지 관련 뉴스     4. 종료");
			String select = br.readLine();
			String location = null;

			switch (select) {
			case "1":
				System.out.println("지역을 입력하세요");
				location = br.readLine();
				WeatherController.weatherSearch(location);
				commentMenu(location);
				break;
			case "2":
				System.out.println("지역을 입력하세요");
				location = br.readLine();
				WeatherController.dustSearch(location);
				commentMenu(location);
				break;
			case "3":
				articleMenu();
				break;
			case "4":
				br.close();
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
		}
	}

	private static void articleMenu() throws IOException {
		String select;
		while (true) {
			System.out.println("-----최근 미세먼지 관련 뉴스-----");
			Map<Integer, Article> map = WeatherController.articleSearch();
			System.out.println("***기사의 내용을 보려면 번호 입력, 뒤로가기는 0 입력***");
			select = br.readLine();
			if (select.equals("0"))
				return;
			Set<Integer> set = map.keySet();
			for (Integer key : set) {
				if (Integer.parseInt(select) == key) {
					System.out.println("-----기사 내용-----");
					WeatherController.articleContent(map.get(key).getUrl());
				}
			}
		}
	}

	public static void commentMenu(String location) throws IOException {
		String select = null;
		while (true) {
			System.out.println("-----이웃이 남긴 댓글리스트-----");
			CommentController.selectLoction(location);
			System.out.println("1. 댓글 작성  2. 댓글 수정   3. 댓글 삭제   4. 이전 메뉴로");
			select = br.readLine();
			String id;
			String content;
			switch (select) {
			case "1":
				System.out.println("아이디 입력");
				id = br.readLine();
				while (true) {
					if (CommentController.getCheckById(id)) {
						FailView.errorMessage(id + "는 중복입니다 다시 입력해주세요.");
						id = br.readLine();
					} else {
						SuccessView.messagePrint(id + "는 사용가능합니다.");
						break;
					}
				}
				System.out.println("내용 입력");
				content = br.readLine();
				CommentController.insert(new CommentDTO(id, content, location,
						new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA).format(new Date())));
				break;
			case "2":
				System.out.println("아이디 입력");
				id = br.readLine();
				System.out.println("내용 입력");
				content = br.readLine();
				CommentController.update(new CommentDTO(id, content, location,
						new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA).format(new Date())));
				break;
			case "3":
				System.out.println("아이디 입력");
				id = br.readLine();
				CommentController.delete(id);
				break;
			case "4":
				System.out.println("이전 메뉴로 돌아갑니다");
				return;
			}
		}
	}
}