package ex100;

import java.util.Scanner;

public class ex55 {

	public static void main(String[] args) {
		// 점수가 입력되면 등급을 출력하는 프로그램을 만드시오.
		 /*   조건
		  	90점 이상 : A 	 80점 이상 : B
		  	70점 이상 : C 	 60점 이상 : D	   60점 미만 : F */
		 /*  입력 : 정수로 점수가 입력된다. ( 입력되는 정수는 0 - 100 이다 )
	      	 출력 : 점수에 따라 등급을 출력한다. */
		 /*  입력 예시 : 80 
	      	 출력 예시 : B */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "점수를 입력하세요.(0-100) : " );
		int score = scan.nextInt();
		
		switch( score/10 ) {
		case 10 :
		case 9 :
			System.out.println( "A" );
			break;
		case 8 :
			System.out.println( "B" );
			break;
		case 7 :
			System.out.println( "C" );
			break;
		case 6 :
			System.out.println( "D" );
			break;
		default :
			System.out.println( "F" );
			break;
		}
	}

}
