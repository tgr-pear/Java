package ex100;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		// 10진수를 입력받아 8진수로 출력되는 프로그램을 작성하시오.
		 /* 입력 : 10진수가 1개 입력된다.
		   			( 단, 입력되는 정수는 int 범위이다. )
		 	출력 : 입력받은 10진수를 8진수로 바꿔 출력한다. */
		 /* 입력 예시 : 10
		 	출력 예시 : 12 */
		 /* 도움말 
		  	* %o를 사용하여 8진수로 출력한다.
		  	* Integer.toOctalString(i); 형태를 사용한다. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "원하는 10진수를 입력하세요.: " );
		int decimal = scan.nextInt();
		System.out.printf( "%o", decimal );
		
		System.out.println(" ");
		
		System.out.println( "원하는 10진수를 입력하세요.: " );
		int decimal2 = scan.nextInt();
		String octal = Integer.toOctalString(decimal2);
		System.out.printf( octal );

	}

}
