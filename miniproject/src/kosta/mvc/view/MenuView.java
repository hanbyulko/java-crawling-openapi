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
			System.out.println("-----�޴� ����-----");
			System.out.println("1. �ǽð� ���� ����     2. �ǽð� ���ȯ�� ����     3. ����");
			String select = sc.next();
			String location = null;
			
			switch (select) {
			case "1":
				System.out.println("������ �Է��ϼ���");
				location = sc.next();
				WeatherController.weatherSearch(location, new SimpleDateFormat("yyyyMMdd", Locale.KOREA).format(new Date()));
			case "2":
				System.out.println("������ �Է��ϼ���");
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
			System.out.println("1. ��� �ۼ�  2. ��� ����   3. ��� ����   4. ���� �޴���");
			select = sc.next();
			String id;
			String content;
			switch (select) {
			case "1":
				System.out.println("���̵� �Է�");
				id = sc.next();
				System.out.println("���� �Է�");
				content = sc.next();
				CommentController.insert(new CommentDTO(id, content, location, new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA).format(new Date())));
				break;
			case "2":
				System.out.println("���̵� �Է�");
				id = sc.next();
				System.out.println("���� �Է�");
				content = sc.next();
				CommentController.update(new CommentDTO(id, content, location, new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA).format(new Date())));
				break;
			case "3":
				System.out.println("���̵� �Է�");
				id = sc.next();
				CommentController.delete(id);
				break;
			case "4":
				System.out.println("���� �޴��� ���ư��ϴ�");
				return;
			}
		}
		
	}
}