package ex100;

import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		/* 정수 2개(a,b)를 입력받아 큰 값을 출력하는 프로그램을 작성하시오.
		 	단, 조건문을 사용하지 않고 3항연산자 ?를 사용한다. */
		 /* 입력 : 정수 2개가 입력된다. 
		 	출력 : 큰 값을 10진수로 출력한다. */
		 /* 입력 예시 : 123 / 523
		 	출력 예시 : 523 */
		 /* 도움말 
		  	  3항 연산자 : '조건식 ? 참일 때 출력 값 : 거짓일 때 출력 값' 의 구조를 가진 연산자
		  	    printf( "%d", a>b ? a : b ); 작성하여 
		  	    	a>b 가 참이면 a / 거짓이면 b를 출력한다. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "정수 2개를 하나씩 입력하세요. :" );
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.printf( "%d", (a>b) ? a : b );
	}

}
