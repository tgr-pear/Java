package ex100;

import java.util.Scanner;

public class ex41 {

	public static void main(String[] args) {
	  /* 1. 공이 30m~40m나 60m~70m 에 들어오면 슬기가 이김.
		 2. 그 외의 구간에 떨어지면 체육선생님이 이김.
		  슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 
	       그 외에는 "lose"를 출력하시오. */
	  /*  입력 : 슬기가 던진 공의 위치가 입력으로 주어진다. ( 정수 )
	      출력 : 공의 위치가 30≤n≤40 이거나 60≤n≤70이면, win을 출력, 그외에는 lose를 출력한다.  */
	  /*  입력 예시 : 50
	      출력 예시 : lose */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "슬기가 던진 공의 위치를 입력하세요.(정수) : " );
		int ball = scan.nextInt();
		
		if ( ( 30<=ball && ball<=40 ) || ( 60<=ball && ball<=70 ) ) {
			System.out.println( "Win" );
		} else {
			System.out.println( "Lose,,," );
		}
	}

}
