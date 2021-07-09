package ex100;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// 10진수를 입력받아 16진수로 출력되는 프로그램을 작성하시오.
		/* 10진법 : 한 자리에 10개( 0 - 9 ) 문자 중 한 개 사용
		   16진법 : 한 자리에 16개( 0 - f ) 문자 중 한 개 사용 */
		 /* 입력 : 10진수가 1개 입력된다.
		 	출력 : 입력받은 10진수를 16진수로 바꿔 출력한다. */
		 /* 입력 예시 : 255
		 	출력 예시 : ff */
		 /* 도움말 
		  	* %x를 사용하여 16진수로 출력한다.
		  	* Integer.toHexString(i); 형태를 사용한다. */

		Scanner scan = new Scanner(System.in);
		System.out.println( "정수 하나를 입력하세요. : " );
		int deci = scan.nextInt();
		String hex = Integer.toHexString(deci);
		System.out.println( deci + "의 16진수 : " + hex );
		
		System.out.println( "정수 하나를 입력하세요. : " );
		int deci2 = scan.nextInt();
		System.out.printf( deci2 + "의 16진수 : " + "%x", deci2 );
	}

}
