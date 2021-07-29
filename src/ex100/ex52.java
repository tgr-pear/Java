package ex100;

import java.util.Scanner;

public class ex52 {

	public static void main(String[] args) {
		// 1 - 99 사이의 숫자를 입력하면 영어 서수를 표현하는 프로그램을 작성하시오. 
		 /* 영어 서수 표현
		  	1st	2nd	3rd 4th	5th ... 99th */
		/*  입력 : 1-99 사이의 숫자 하나를 입력받는다.
	      	출력 : 입력받은 숫자를 기준으로 영어 서수를 표현한다. */
		/*  입력 예시 : 2
	      	출력 예시 : 2nd */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "원하는 숫자 하나를 입력해주세요.( 1-99 ) : " );
		int number = scan.nextInt();
		
		switch( number ) {
		case 1 : 
			System.out.println( number + "st" );
			break;
		case 2 : 
			System.out.println( number + "nd" );
			break;
		case 3 : 
			System.out.println( number + "rd" );
			break;
		default :
			System.out.println( number + "th" );
			break;
		}

	}

}
