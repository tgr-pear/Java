package ex100;

import java.util.Scanner;

public class ex58 {

	public static void main(String[] args) {
		/* 입력을 받아 삼각형을 만들 수 있는지 판단하는 프로그램을 만드시오.
		 	a, b, c가 변의 길이이고, c가 가장 길다면 
		 	c < a + b이면 삼각형이 성립된다. */
		 /*  입력 : 직선의 길이 3개가 입력된다. 
	      	 출력 : 입력에 따라 삼각형이 되는지 출력한다. 
	      	 		  가능하다면 "Yes" / 불가능하다면 "No" */
		 /*  입력 예시 : 2 / 3 / 4 
	      	 출력 예시 : Yes */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "첫번째 길이를 입력하세요." );
		int a = scan.nextInt();
		System.out.println( "두번째 길이를 입력하세요." );
		int b = scan.nextInt();
		System.out.println( "세번째 길이를 입력하세요." );
		int c = scan.nextInt();
		
		
		boolean triangle;
		if ( c > a && c > b ) {
			triangle = c < a+b ;
		} else if ( b > a && b > c ) {
			triangle = b < a+c ;
		} else {
			triangle = a < b+c ;
		}
		
		if ( triangle == true ) {
			System.out.println( "Yes!" );
		} else {
			System.out.println( "No" );
		}
	
	/*	
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		int maxLength = 0;
		
		for ( int i=0 ; i<arr.length ; i++ ) {
			if ( maxLength < arr[i] ) {
				maxLength = arr[i];
			}
		}
		
		if ( maxLength == arr[0] ) {
			if ( a < b+c ) {
				System.out.println( "Yes!" );
			} else {
				System.out.println( "No" );
			}
		} else if ( maxLength == arr[1] ) {
			if ( b < a+c ) {
				System.out.println( "Yes!" );
			} else {
				System.out.println( "No" );
			}
		} else {
			if ( b < a+c ) {
				System.out.println( "Yes!" );
			} else {
				System.out.println( "No" );
			}
		}
	 */
	}
}
