package ex100;

import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		/* 정수가 순서대로 입력될 때 아래 조건을 만족하도록 출력하시오.
		 	조건 : 0이 아니면 입력된 정수를 출력하고 / 
		 		   0이 입력되면 출력을 중단하시오. */
		 /* 입력 : 정수가 순서대로 입력된다. 
		  			( 단, 개수는 알 수 없다. )
		 	출력 : 입력된 정수를 줄을 바꿔 하나씩 출력하는데,
		  			0이 입력되면 0을 출력하고 종료한다. */
		 /* 입력 예시 : 7 / 3 / 1 / 0 
		 	출력 예시 : 7 / 3 / 1 / End */
		 /* 도움말 : 무한 반복문을 만드시오. 
		  	* while ( true ) { ~ }
		  	* for ( ; ; ) { ~ } 
		  	* 반복문 안에서 
		  		continue 제어문은 반복루틴의 처음으로 바로 올라가는 문장 ( 아래의 문장은 수행 X ) 
		  		break 제어문은 반복문을 탈출하는 문장. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "정수를 하나씩 입력하세요. :" );
		
		while ( true ) {
			int number = scan.nextInt();
			if ( number == 0 ) {
				System.out.println( "End" );
				break;
			}
			System.out.println( number );
		}
	}

}
