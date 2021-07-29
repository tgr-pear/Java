package ex100;

import java.util.Scanner;

public class ex59 {

	public static void main(String[] args) {
		// 로또 순위를 맞취주는 프로그램을 만드시오.
		 /* 로또 순위를 매기는 방법 
		  	1등 : 당첨번호 6개가 일치하는 상태
		  	2등 : 당첨번호 5개가 일치하는 상태 + 보너스 번호 일치
		  	3등 : 당첨번호 5개가 일치하는 상태
		  	4등 : 당첨번호 4개가 일치하는 상태
		  	5등 : 당첨번호 3개가 일치하는 상태
		  	꽝 : 당첨번호가 2개 이하로 일치하는 상태
		  */
		 /*  입력_1 : 로또 당첨번호 6개와 보너스번호 1개가 입력된다. 
		  	 입력_2 : 내가 가지고 있는 로또 번호 6개가 입력된다.
	      	 출력 : 나의 당첨 결과를 출력한다. */
		 /*  입력_1 예시 : 14 / 21 / 35 / 36 / 40 / 44 + 30   
		     입력_2 예시 : 39 / 21 / 5 / 26 / 40 / 2  
	      	 출력 예시 : 꽝 */
		
		Scanner scan = new Scanner(System.in);
		int[] numOfLotto = new int[7];
		for( int i=0 ; i<6 ; i++ ){
			System.out.print( i + "번째 로또번호 : ");
			numOfLotto[i] = scan.nextInt();
		}
		System.out.print( "보너스 번호 : ");
		int bonus = scan.nextInt();
		
		int[] myNum = new int[6];
		for( int j=0 ; j<6 ; j++ ){
			System.out.print( j + "번째 나의 로또번호 : " );
			myNum[j] = scan.nextInt();
		}
		
		int count = 0;
		for ( int i=0 ; i<6 ; i++ ) {
			for ( int j=0 ; j<myNum.length ; j++ ) {
				if ( myNum[j] == numOfLotto[i] ) {
					count = count + 1; 
				}
			}
		}
		
		int bonusCount = 0;
		switch ( count ) {
		  case 1 : 
		  case 2 :
			  System.out.println( "꽝입니다!" );
			  break;
		  case 3 : 
			  System.out.println( "5등 입니다!" );
			  break;
		  case 4 : 
			  System.out.println( "4등 입니다!" );
			  break;
		  case 5 : 
			  for ( int j=0 ; j<myNum.length ; j++ ) {
				  if ( myNum[j] == bonus ) {
					  bonusCount++;  
				  }
			  }
			  if ( bonusCount > 0 ) {
				  System.out.println( "2등입니다!" );
			  } else {
				  System.out.println( "3등입니다!" );
			  }
			  break;
		  case 6 : 
			  System.out.println( "1등 입니다!" );
			  break;
		}
	}

}
