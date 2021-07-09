package ex100;

import java.util.Scanner;

public class ex38 {

	public static void main(String[] args) {
		/* 삼각형의 넓이를 구하는 프로그램을 작성한다.
		 	삼각형의 넓이 = 밑변 * 높이 / 2 */
		 /* 입력 : 밑변과 높이가 정수로 입력된다.
		 	출력 : 삼각형의 넓이를 소수 첫째자리까지 출력한다. */
		 /* 입력 예시 : 5 / 2 
		 	출력 예시 : 5.0 */
		 /* 도움말 
		  * 정수끼리의 연산결과 = 정수
		  * 실수끼리의 연산결과 = 실수
		  * 정수와 실수의 연산결과 = 실수 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print( "정수 2개를 하나씩 입력하세요. : " );
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		double triangle= (double) (a * b / 2.0);
		System.out.println( triangle );
	}

}
