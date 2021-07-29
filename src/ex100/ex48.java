package ex100;

import java.util.Scanner;

public class ex48 {

	public static void main(String[] args) {
		// 주민번호의 앞자리와 뒷자리 첫번째 숫자를 바탕으로 현재 나이를 출력하는 프로그램을 만드시오. ( 기준 연도는 2021년 )
		 /* 성별정보 
		    1. 1900년대 출생 남자 
		    2. 1900년대 출생 여자 
		    3. 2000년대 출생 남자  	
		    4. 2000년대 출생 여자   */
		/*  입력 : 생년월일 (6자리)과 성별정보 (1자리)가 차례대로 정수로 입력된다.
	      	출력 : 2021년 기준 현재 나이를 출력한다. */
		/*  입력 예시 : 990304 / 1
	      	출력 예시 : 나이는 23입니다. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "생년월일(6자리)를 입력하세요. : " );
		int year = scan.nextInt();
		System.out.println( "성별자리(1자리)를 입력하세요.(1-4) : " );
		int gender = scan.nextInt();
		
		int age ;
		switch ( gender ) {
		case 1 : 
		case 2 :
			year = 1900 + year / 10000;
			age = (2021 - year) + 1;
			System.out.println( age );
			break;
		case 3 :
		case 4 : 
			year = 2000 + year / 10000;
			age = (2021 - year) + 1;
			System.out.println( age );
			break;
		}
	}
	
}
