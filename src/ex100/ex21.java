package ex100;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		// 정수 2개(a,b)를 입력받아 a * 2^b를 계산하는 프로그램을 작성하시오.
		 /* 입력 : 정수 2개가 입력된다. 
		 	출력 : 입력받은 a에 2^b를 곱하여 출력한다. */
		 /* 입력 예시 : 1 / 3
		 	출력 예시 : 8 = 1 * ( 2^3 ) */
		 // 도움말 : Math.pow(a,b) 함수를 이용하면, a^b의 결과값을 반환한다. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "정수 2개를 차례대로 입력하세요. : " );
		int num_a = scan.nextInt();
		int num1 = scan.nextInt();
		
		int num_b = (int) Math.pow( 2, num1 );
		System.out.println( "결과값 : " + (num_a * num_b) );
	}

}
