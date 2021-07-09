package ex100;

import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		// 정수 한 개를 입력받아 1부터 그 수까지 짝수의 합을 출력하시오.
		 /* 입력 : 정수 하나가 입력된다. ( 0 ~ 100 )
		 	출력 : 1부터 입력된 수까지 짝수의 합을 출력한다. */
		 /* 입력 예시 : 5
		 	출력 예시 : 6 ( = 2 + 4 ) */
		 /* 도움말 : 반복문을 사용하여 해결할 수 있다.
		  	  * for( ; ; ) { ~ } 
		  	  * while() { ~ } 
		  	  * do { ~ } while(); */
		
		Scanner scan = new Scanner(System.in);
		System.out.print( "정수 하나를 입력하세요. : " );
		int num = scan.nextInt();
		int sum = 0;
		for ( int i=1 ; i<=num ; i++ ) {
			if ( i%2 == 0 ) {
				sum = sum+i;
			}
		}
		System.out.println( "1부터 " + num + "까지 짝수의 합 : " + sum );

	}

}
