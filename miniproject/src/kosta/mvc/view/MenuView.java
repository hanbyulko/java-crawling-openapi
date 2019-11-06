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
			System.out.println("-----�޴� ����-----");
			System.out.println("1. �ǽð� ���� ����     2. �ǽð� ���ȯ�� ����     3. �̼����� ���� ����     4. ����");
			String select = br.readLine();
			String location = null;

			switch (select) {
			case "1":
				System.out.println("������ �Է��ϼ���");
				location = br.readLine();
				WeatherController.weatherSearch(location);
				commentMenu(location);
				break;
			case "2":
				System.out.println("������ �Է��ϼ���");
				location = br.readLine();
				WeatherController.dustSearch(location);
				commentMenu(location);
				break;
			case "3":
				articleMenu();
				break;
			case "4":
				br.close();
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
			}
		}
	}

	private static void articleMenu() throws IOException {
		String select;
		while (true) {
			System.out.println("-----�ֱ� �̼����� ���� ����-----");
			Map<Integer, Article> map = WeatherController.articleSearch();
			System.out.println("***����� ������ ������ ��ȣ �Է�, �ڷΰ���� 0 �Է�***");
			select = br.readLine();
			if (select.equals("0"))
				return;
			Set<Integer> set = map.keySet();
			for (Integer key : set) {
				if (Integer.parseInt(select) == key) {
					System.out.println("-----��� ����-----");
					WeatherController.articleContent(map.get(key).getUrl());
				}
			}
		}
	}

	public static void commentMenu(String location) throws IOException {
		String select = null;
		while (true) {
			System.out.println("-----�̿��� ���� ��۸���Ʈ-----");
			CommentController.selectLoction(location);
			System.out.println("1. ��� �ۼ�  2. ��� ����   3. ��� ����   4. ���� �޴���");
			select = br.readLine();
			String id;
			String content;
			switch (select) {
			case "1":
				System.out.println("���̵� �Է�");
				id = br.readLine();
				while (true) {
					if (CommentController.getCheckById(id)) {
						FailView.errorMessage(id + "�� �ߺ��Դϴ� �ٽ� �Է����ּ���.");
						id = br.readLine();
					} else {
						SuccessView.messagePrint(id + "�� ��밡���մϴ�.");
						break;
					}
				}
				System.out.println("���� �Է�");
				content = br.readLine();
				CommentController.insert(new CommentDTO(id, content, location,
						new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA).format(new Date())));
				break;
			case "2":
				System.out.println("���̵� �Է�");
				id = br.readLine();
				System.out.println("���� �Է�");
				content = br.readLine();
				CommentController.update(new CommentDTO(id, content, location,
						new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA).format(new Date())));
				break;
			case "3":
				System.out.println("���̵� �Է�");
				id = br.readLine();
				CommentController.delete(id);
				break;
			case "4":
				System.out.println("���� �޴��� ���ư��ϴ�");
				return;
			}
		}
	}
}