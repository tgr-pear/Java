package ex100;

import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		// 정수 3개(a,b,c)를 입력받아 짝수만 출력하시오.
		 /* 입력 : 정수 3개가 입력된다. 
		 	출력 : 짝수만 순서대로 출력한다. */
		 /* 입력 예시 : 2 / 5 / 10
		 	출력 예시 : 2 / 10 */
		 // 도움말 : if문을 사용하여 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "정수 3개를 차례대로 입력하시오. :" );
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if ( a%2 == 0 ) 
		{  System.out.println( a );  } 
		if ( b%2 == 0 ) 
		{  System.out.println( b );  } 
		if ( c%2 == 0 ) 
		{  System.out.println( c );  } 
	}

}
