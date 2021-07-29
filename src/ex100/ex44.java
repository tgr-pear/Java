package ex100;

import java.util.Scanner;

public class ex44 {

	public static void main(String[] args) {
		/* 주원이가 아르바이트를 가는 요일은 월, 수, 금, 일이다
		 	요일의 순서를 입력받아 다음과 같이 출력하세요. */
		 /* 요일의 순서
		    1. 월요일   2. 화요일 	3. 수요일 	4. 목요일
		    5. 금요일	6. 토요일	7. 일요일 */
		/*  입력 : 정수로 요일의 번호를 하나 입력한다.
	      	출력 : 출근하는 날이라면 "Oh My God"
		 			   쉬는 날이라면 "Enjoy"를 출력한다. */
		/*  입력 예시 : 4
	      	출력 예시 : Enjoy */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "1-7 사이의 정수를 하나 입력하세요. : " );
		int day = scan.nextInt();
		
		int[] partTimeJob = new int[4];
		partTimeJob[0] = 1;
		partTimeJob[1] = 3;
		partTimeJob[2] = 5;
		partTimeJob[3] = 7;
		
		for ( int i=0 ; i<4 ; i++ ) {
			if ( partTimeJob[i] != day ) {
				System.out.println( "Enjoy" );
				break;
			} else {
				System.out.println( "Oh My God" );
				break;
			}
		}

	}

}
