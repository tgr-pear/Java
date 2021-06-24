package ex100;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// 키보드로 입력한 실수값을 그대로 출력하는 프로그램을 작성하시오.
		 /* 입력 : 실수값 한 개가 입력된다.
	        출력 : 입력된 실수를 그대로 출력한다. */
		 /* 입력 예시 : 15.62
	        출력 예시 : 15.62 */
	     /* 도움말 : Scanner 클래스를 이용한다.
	      			 nextFloat() 메소드 사용한다. */
			
			// Float
			System.out.println( "원하는 실수를 입력해주세요." );
			Scanner scan = new Scanner( System.in );
			Float i = scan.nextFloat();
			System.out.println( i );
			
			// Double
			 /* Double j = scan.nextDouble(); 
				System.out.println( j ); */

	}

}
