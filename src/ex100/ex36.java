package ex100;

import java.util.Scanner;

public class ex36 {

	public static void main(String[] args) {
		/* 1부터 n까지 / 1부터 m까지 숫자가 적힌 
		 	서로 다른 주사위 2개를 던졌을 때 나올 수 있는 경우의 수를 출력하시오. */
		 /* 입력 : 서로 다른 주사위의 면의 개수 n / m 이 입력된다. 
		  			( 단, n / m 은 10이하의 자연수 ) 
		 	출력 : 나올 수 있는 주사위의 숫자가 한 세트씩 줄을 바꿔 모두 출력된다. */
		 /* 입력 예시 : 2 / 3 
		 	출력 예시 : 1 1 / 1 2 / 1 3 / 2 1 / 2 2 / 2 3 */
		 /* 도움말 : 중첩의 원리를 사용하여 작성하시오.
		  		반복 실행구조를 중첩하면 반복구조를 다양하게 만들 수 있다. */
		
		Scanner scan = new Scanner(System.in);
		System.out.print( "10이하의 자연수를 2개 입력하세요. : " );
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		for ( int i=1 ; i<=n ; i++ ) {
			for ( int j=1 ; j<=m ; j++ ) {
				System.out.print( i + " " + j );
				System.out.println(" ");
			}
		}

	}

}
