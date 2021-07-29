package ex100;

import java.util.Scanner;

public class ex46 {

	public static void main(String[] args) {
		/* 어떤 차의 높이가 170cm이다. 
		 	차는 3개의 터널을 지난다. 밑의 조건을 만족하는 프로그램을 만드시오.  */
		 /* 터널의 높이가 차의 높이와 같거나 낮으면 사고 발생
		    								 높으면 통과 */
		 /*  입력 : 정수로 터널의 높이가 3개 입력된다.
	      	  출력 : 무사히 통과한다면 "Pass"
		 		   사고가 났다면 "Crash"를 출력한다. */
		 /*  입력 예시 : 160 / 170 / 190 
	      	  출력 예시 : Crash / Crash / Pass */
		
		int carHeight = 170;
		Scanner scan = new Scanner(System.in);
		int[] tunnel = new int[3];
		for ( int i=0 ; i<3 ; i++ ) {
			System.out.println( (i+1) + "번째 터널의 높이를 입력하세요. :" );
			tunnel[i] = scan.nextInt();
			if ( carHeight >= tunnel[i]) {
				System.out.println( "Crash" );
			} else {
				System.out.println( "Pass" );
			}
		}
	}
}
