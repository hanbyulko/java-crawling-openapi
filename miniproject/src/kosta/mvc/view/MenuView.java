package kosta.mvc.view;

import java.util.Scanner;

import kosta.mvc.controller.Controller;

public class MenuView {
	
	public static void menuPrint() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-----�޴� ����-----");
			System.out.println("1. ��ü �˻�    2. ���� �˻�     3. ����");
			String select = sc.next();
			
			switch (select) {
			case "1" : 
				Controller.searchAll();
				break;
			case "2" :
				System.out.println("������ �Է��ϼ���");
				Controller.dustSearch(sc.next());
				break;
			case "3" :
				sc.close();
				System.exit(0);
			}
		}
	} 
	
	public void aa() {
		
	}
}