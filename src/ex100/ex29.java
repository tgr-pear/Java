package ex100;

import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		// 정수 3개(a,b,c)를 입력받아 짝수(even) / 홀수(odd)를 출력하시오.
		 /* 입력 : 정수 3개가 입력된다. 
		 	출력 : 순서대로 짝수(even) / 홀수(odd)를 출력한다. */
		 /* 입력 예시 : 2 / 5 / 10
		 	출력 예시 : 짝수(even) / 홀수(odd) / 짝수(even) */
		 // 도움말 : if문을 사용하여 작성하시오.

		Scanner scan = new Scanner(System.in);
		System.out.println( "정수 3개를 하나씩 입력해주세요. :" );
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if ( a%2 == 0 ) {
			System.out.println( a + " : 짝수(even)" );
		} else {
			System.out.println( a + " : 홀수(odd)" );
		}
		if ( b%2 == 0 ) {
			System.out.println( b + " : 짝수(even)" );
		} else {
			System.out.println( b + " : 홀수(odd)" );
		}
		if ( c%2 == 0 ) {
			System.out.println( c + " : 짝수(even)" );
		} else {
			System.out.println( c + " : 홀수(odd)" );
		}
	}

}
