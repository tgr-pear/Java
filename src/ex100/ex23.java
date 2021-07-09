package ex100;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		/* 정수 2개(a,b)를 입력받아 밑의 조건을 만족하는 프로그램을 작성하시오.
	  		조건 : a가 b와 같으면 1 / a가 b와 같지 않으면 0을 출력 */
		 /* 입력 : 정수 2개가 입력된다. 
		 	출력 : a가 b와 같으면 1 / a가 b와 같지 않으면 0을 출력한다. */
		 /* 입력 예시 : 0 / 0
		 	출력 예시 : 1 */
		 /* 도움말 : if문을 사용하여 작성하시오.
		  		관계 연산자 '=='는 그 결과가 참인 경우 정수값 1로 계산되고 거짓인 경우 정수값 0으로 계산된다. */

		Scanner scan = new Scanner(System.in);
		System.out.println( "정수 2개를 하나씩 입력하세요. :" );
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if ( a==b ) {
			System.out.println( "1" );
		} else {
			System.out.println( "0" );
		}
	}

}
