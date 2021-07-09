package ex100;

import java.util.Scanner;

public class ex42 {

	public static void main(String[] args) {
		/* 1. 공의 위치가 50m~70m이면 슬기가 이김. 또는
		   2. 공의 위치가 6의 배수이면 슬기가 이김. 
			  슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 
		       그 외에는 "lose"를 출력하시오. */
		  /*  입력 : 슬기가 던진 공의 위치가 입력으로 주어진다. ( 정수 )
		      출력 : 공의 위치가 승리 조건이면  win을 출력, 그 외에는 lose를 출력한다.  */
		  /*  입력 예시 : 30
		      출력 예시 : lose */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "슬기가 던진 공의 위치를 입력하세요.(정수) : " );
		int ball = scan.nextInt();
		
		if ( ( 50<=ball && ball<=70 ) || ( ball%6 == 0 ) ) {
			System.out.println( "Win!" );
		} else {
			System.out.println( "Lose,,," );
		}
	}

}
