package ex100;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// 키보드로 입력한 정수값을 그대로 출력하는 프로그램을 작성하시오.
		 /* 입력 : 정수값 한 개가 입력된다.
	        출력 : 입력된 정수를 그대로 출력한다. */
		 /* 입력 예시 : 15
	        출력 예시 : 15 */
	     /* 도움말 : Scanner 클래스를 이용한다.
	      			 nextInt() 메소드 사용한다. */
		
		System.out.println( "원하는 정수를 입력해주세요." );
		Scanner scan = new Scanner( System.in );
		int i = scan.nextInt();
		System.out.println( i );
		
	}

}
