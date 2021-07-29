package ex100;

import java.util.Scanner;

public class ex49 {

	public static void main(String[] args) {
		// 시간을 입력하면 30분 전을 출력하는 프로그램을 만드시오. 
		/*  입력 : 시(0-23)와 분(0-59)을 입력한다.
	      	출력 : 입력한 시간의 30분 전을 출력한다. */
		/*  입력 예시 : 12 / 35
	      	출력 예시 : 12시 5분입니다. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "시를 입력하세요.(0-23) : " );
		int hour = scan.nextInt();
		System.out.println( "분을 입력하세요.(0-59) : " );
		int minute = scan.nextInt();
		
		if ( hour > 23 || minute > 60 ) {
			System.out.println( "올바른 시간이 아닙니다.");
		} else if ( minute < 30 ) {
			hour = hour-1;
			minute = (60+minute) - 30;
			System.out.println( "30분 전의 시간은 " + hour + "시 " + minute + "분 입니다." );
		} else {
			minute -= 30;
			System.out.println( "30분 전의 시간은 " + hour + "시 " + minute + "분 입니다." );
		}
		  
	}

}
