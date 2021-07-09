package ex100;

import java.util.Scanner;

public class ex39 {

	public static void main(String[] args) {
		// 세 정수가 주어지면 그 중 가장 작은 수를 출력한다.
		 /* 입력 : 정수 3개가 입력된다.
		 	출력 : 가장 작은 값을 출력한다. */
		 /* 입력 예시 : 5 / 2 / 9
		 	출력 예시 : 2 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print( "숫자 3개를 입력하세요. : " );
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if ( Math.min(num1, num2) == num2 ) {
			System.out.println( Math.min(num2, num3) );
		} else {
			System.out.println( Math.min(num1, num3) );
		}
		
		/*
			int[] num = new int[3];
			for ( int i=0 ; i<3 ; i++ ) {
				System.out.print( "숫자를 입력하세요. : " );
				num[i] = scan.nextInt();
			}
			int min = num[0];
			for ( int i=0 ; i<3 ; i++ ) {
				if ( min > num[i] ) {
					min = num[i];
				}
			}
			System.out.println( "최솟값은 : " + min );
		*/
	}

}
