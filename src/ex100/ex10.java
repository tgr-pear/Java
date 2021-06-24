package ex100;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// 정수를 두개 입력받아 그대로 출력하시오.
		 /* 입력 : 정수값 두 개가 입력된다.
	        출력 : 입력된 두 정수를 구분하여 그대로 출력한다. */
		 /* 입력 예시 : 1 
		  				5
	        출력 예시 : 1 5 */
	     /* 도움말 : Scanner 클래스를 이용한다.
	      			 nextInt() 메소드 사용한다. */
		
			System.out.println( "원하는 정수를 2개 입력해주세요." );
			Scanner scan = new Scanner( System.in );
			int i = scan.nextInt();
			int j = scan.nextInt();
			System.out.print( i + " " + j );

	}

}
