package kosta.mvc.view;

import java.util.Scanner;

import kosta.mvc.controller.DustController;

public class MenuView {
	
	public static void menuPrint() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-----메뉴 선택-----");
			System.out.println("1. 전체 검색    2. 지역 검색    3. 현재 위치 검색    3. 종료");
			String select = sc.next();
			
			switch (select) {
			case "1" : 
				DustController.searchAll();
				break;
			case "2" :
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