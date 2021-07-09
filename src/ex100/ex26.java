package ex100;

import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		// 참(true) 또는 거짓(false)이 입력되었을 때 반대로 출력하는 프로그램을 작성하시오.
		 /* 입력 : Boolean 값 1개가 입력된다. 
		 	출력 : 입력된 값이 true이면 false / 
		 	 				   false이면 true를 출력한다. */
		 /* 입력 예시 : true
		 	출력 예시 : false */
		 /* 도움말 : 논리(NOT)연산자 ! 
			  	참 또는 거짓의 논리값을 역으로 바꾸기위해 사용 */

			Scanner scan = new Scanner(System.in);
			System.out.println( "true / false 중 하나를 입력하세요. :" );
			boolean text = scan.nextBoolean();
			
			if ( text == true ) {
				System.out.println( "false" );
			} else {
				System.out.println( "true" );
			}
			
//			 System.out.println( !text );
	}

}
