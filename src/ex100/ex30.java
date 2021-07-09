package ex100;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		/* 숫자 한 개를 입력받아 
		 	양수(plus) / 음수(minus) / 짝수(even) / 홀수(odd)를 출력하시오. */
		 /* 입력 : 숫자가 입력된다. 
		 	출력 : 양수(plus) / 음수(minus) / 짝수(even) / 홀수(odd)를 출력한다. */
		 /* 입력 예시 : -10
		 	출력 예시 : 음수(minus) / 짝수(even) */
		 // 도움말 : if문을 사용하여 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "숫자 하나를 입력하세요. :" );
		int number = scan.nextInt();
		
		if ( number < 0 ) {
			System.out.print( number + " : 음수(minus)" );
		} else {
			System.out.print( number + " : 양수(plus)" );
		}
		if ( number%2 == 0 ) {
			System.out.print( ", 짝수(even)" );
		} else {
			System.out.println( ", 홀수(odd)" );
		}
	}

}
