package ex100;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		// 점수(정수)를 입력받아 평가를 출력하시오. ( 0 ~ 100 )
		 /* 평가기준 
		  * 점수 범위 : 평가
		  *  90 - 100 :  A 
		  *  70 - 89  :  B
		  *  40 - 69  :  C
		  *   0 - 39  :  D
		  */
		 /* 입력 : 정수 1개가 입력된다. ( 0 ~ 100 ) 
		 	출력 : 평가 기준에 따라 평가가 문자로 출력된다. */
		 /* 입력 예시 : 56
		 	출력 예시 : c */
		 // 도움말 : if문을 사용하여 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "0~100 사이의 숫자를 하나 입력하세요. :" );
		int score = scan.nextInt();
		
		if ( score <= 100 && score >= 90 ) {
			System.out.println( "A" );
		} else if ( score <= 89 && score >= 70 ) {
			System.out.println( "B" );
		} else if ( score <= 69 && score >= 40 ) {
			System.out.println( "C" );
		} else {
			System.out.println( "D" );
		}
	}

}
