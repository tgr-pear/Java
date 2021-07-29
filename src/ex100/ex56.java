package ex100;

import java.util.Scanner;

public class ex56 {

	public static void main(String[] args) {
		// 입력을 받아 아래의 조건을 만족하도록 출력하는 프로그램을 만드시오.
		 /* 조건 
		  	윷의 상태 ; 
		  	  0 : 뒤집어지지 않은 상태 / 1 : 뒤집어진 상태
		  	도 : 1개가 뒤집어진 상태 ; 0 1 0 0 
		  	개 : 2개가 뒤집어진 상태 ; 0 1 1 0 
		  	걸 : 3개가 뒤집어진 상태 ; 0 1 1 1 
		  	윷 : 4개가 뒤집어진 상태 ; 1 1 1 1
		  	모 : 한개도 뒤집어지지 않은 상태 ; 0 0 0 0
		  */
		 /*  입력 : 윷의 각각 상태가 입력된다. 
	      	 출력 : 입력에 따라 윷의 상태를 출력한다. */
		 /*  입력 예시 : 0 1 0 0  
	      	 출력 예시 : 도 */
		
		Scanner scan = new Scanner(System.in);
		int[] play = new int[4];
		int count = 0;
		for ( int i=0 ; i<4 ; i++ ) {
			System.out.print( (i+1) +"번째 윷을 던지세요! (0/1) :" );
			play[i] = scan.nextInt();
			
			if ( play[i] == 1 ) {
				count++;
			}
		}
		System.out.println( "1이 나온 개수는 : " +  count );
		
		switch( count ) {
		case 1 :
			System.out.print( "던진 윷은 '도'입니다." );
			break;
		case 2 :
			System.out.print( "던진 윷은 '개'입니다." );
			break;
		case 3 :
			System.out.print( "던진 윷은 '걸'입니다." );
			break;
		case 4 :
			System.out.print( "던진 윷은 '윷'입니다." );
			break;
		default :
			System.out.print( "던진 윷은 '모'입니다." );
			break;
		}
	}

}
