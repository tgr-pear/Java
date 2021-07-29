package ex100;

import java.util.Scanner;

public class ex54 {

	public static void main(String[] args) {
		// 두 자연수를 입력받아 아래 조건을 만족하는 프로그램을 만드시오. 
		 /*   조건 
		  	b가 a의 배수이면 "a * x = b"를 출력하고 
		  	a가 b의 배수이면 "b * x = a"를 출력하고
		  	배수 관계가 아니면 "none"을 출력하시오. */
		 /*  입력 : 자연수 2개가 입력된다.
	      	 출력 : 위의 조건에 해당하도록 출력한다. */
		 /*  입력 예시 : 4 / 12 
	      	 출력 예시 : 4 * 3 = 12 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print( "첫번째 자연수를 하나 입력하세요. : " );
		int a = scan.nextInt();
		System.out.print( "두번째 자연수를 하나 입력하세요. : " );
		int b = scan.nextInt();
		
		if ( b%a == 0 ) {
			System.out.println( a + " * " + (b/a) + " = " + b );
		} else if ( a%b == 0 ) {
			System.out.println( b + " * " + (a/b) + " = " + a );
		} else {
			System.out.println( "none" );
		}
	}
}
