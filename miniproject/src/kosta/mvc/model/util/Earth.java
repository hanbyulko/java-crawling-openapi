package kosta.mvc.model.util;

import java.awt.Point;

public class Earth {

	public Point earth(String region) {
		switch(region) {
		case "종로구" : return new Point(60,127);
		case "중구" : return new Point(60,127);
		case "용산구" : return new Point(60,126);
		case "성동구" : return new Point(61,127);
		case "광진구" : return new Point(60,127);
		case "동대문구" : return new Point(60,127);
		case "중랑구" : return new Point(60,127);
		case "성북구" : return new Point(60,127);
		case "강북구" : return new Point(60,127);
		case "도봉구" : return new Point(60,127);
		case "노원구" : return new Point(60,127);
		case "은평구" : return new Point(60,127);
		case "서대문구" : return new Point(60,127);
		case "마포구" : return new Point(60,127);
		case "양천구" : return new Point(60,127);
		case "강서구" : return new Point(60,127);
		case "구로구" : return new Point(60,127);
		case "금천구" : return new Point(60,127);
		case "영등포구" : return new Point(60,127);
		case "동작구" : return new Point(60,127);
		case "관악구" : return new Point(60,127);
		case "서초구" : return new Point(60,127);
		case "강남구" : return new Point(60,127);
		case "송파구" : return new Point(60,127);
		case "강동구" : return new Point(60,127);
		case "중구" : return new Point(60,127);
		
		
		}
		return null;
	}
	
	
}
