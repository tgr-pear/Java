package ex100;

import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		// 월을 나타내는 정수 1개가 입력될 때 계절을 출력하시오.
		 /* 예
		  *     월    : 계절
		  * 12, 1, 2  : winter
		  *  3, 4, 5  : spring
		  *  6, 7, 8  : summer
		  * 9, 10, 11 : fall
		  */
		 /* 입력 : 월을 의미하는 한 개의 정수가 입력된다. ( 1~12 ) 
		 	출력 : 계절을 출력한다. */
		 /* 입력 예시 : 12
		 	출력 예시 : winter */
		 /* 도움말 : switch - case문을 사용하여 작성하시오.
		  		break; 를 사용하지 않으면 이후의 명령들도 계속 실행된다. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "월을 의미하는 한 개의 정수를 압력하시오 :" );
		int month = scan.nextInt();
		
		switch ( month ) {
		case 12 :
		case 1 : 
		case 2 : 
			System.out.println( "winter" );
			break;
		case 3 :
		case 4 : 
		case 5 : 
			System.out.println( "spring" );
			break;
		case 6 :
		case 7 : 
		case 8 : 
			System.out.println( "summer" );
			break;
		case 9 :
		case 10 : 
		case 11 : 
			System.out.println( "fall" );
			break;
		}
	}

}
