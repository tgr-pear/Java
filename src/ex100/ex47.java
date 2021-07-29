package ex100;

import java.util.Scanner;

public class ex47 {

	public static void main(String[] args) {
		// 윤년(2월 29일까지 있는 해)을 판단하는 프로그램을 작성하시오.
		 /* 윤년 판단 조건 ( 두 조건 중 하나라도 맞으면 윤년이다 )
		  	1. 해가 4의 배수이면서 100의 배수가 아닌 연도
		  	2. 400의 배수인 연도 */
		 /*  입력 : 해가 입력된다
	      	  출력 : 윤년이면 "Yes" / 아니라면 "No"를 출력한다. */
		 /*  입력 예시 : 2012 
	      	  출력 예시 : Yes */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "원하는 연도를 입력하세요.: " );
		int year = scan.nextInt();
		
		
		/*	if ( ( year%4 == 0 && year%100 != 0 ) || ( year%400 == 0 ) ) {
				System.out.println( "Yes! 윤년이 맞습니다.");
			} else {
				System.out.println( "No,,, 윤년이 아닙니다.");
			}	*/
		
		if ( year%4 == 0 && year%100 != 0 ) {
			System.out.println( "Yes! 윤년이 맞습니다. (1번 조건) ");
		} else if ( year%400 == 0 )  {
			System.out.println( "Yes! 윤년이 맞습니다. (2번 조건) ");
		} else {
			System.out.println( "No,,, 윤년이 아닙니다.");
		}

	}

}
