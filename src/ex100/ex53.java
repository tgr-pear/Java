package ex100;

import java.util.Scanner;

public class ex53 {

	public static void main(String[] args) {
		// 두 정수를 입력받아 사칙연산 중 가장 큰 값을 출력하는 프로그램을 작성하시오. 
		 /* 실수 1 : 2 / 실수 2 : 3
		  	* 더하기 : 2 + 3 = 5 
		  	* 빼기 : 3 - 2 = 1 
		  	* 곱하기 : 2 * 3 = 6 ( 출력! )
		  	* 나누기 : 3 / 2 = 1 ( : int )
		  	  단, 계산 결과는 모두 int범위 이내이다. */
		/*  입력 : 두 정수를 입력받는다.
	      	출력 : 최댓값을 출력한다. */
		/*  입력 예시 : 2 / 3 
	      	출력 예시 : 최댓값은 6입니다. */

		Scanner scan = new Scanner(System.in);
		System.out.println( "첫번째 수를 입력하세요. : " );
		int num1 = scan.nextInt();
		System.out.println( "두번째 수를 입력하세요. : " );
		int num2 = scan.nextInt();
		
		double[] num = new double[4];
		double max = 0.0;
		if ( num1 > num2 ) {
			num[0] = num1 + num2;
			num[1] = num1 - num2;
			num[2] = num1 * num2;
			num[3] = num1 / num2;
		} else {
			num[0] = num1 + num2;
			num[1] = num2 - num1;
			num[2] = num1 * num2;
			num[3] = num2 / num1;
		}
		
		int i;
		for ( i=0 ; i<num.length ; i++ ) {
			if ( max < num[i] ) {
				max = num[i];
			}
		}
		
		System.out.println( "최대값은 : " + (int) max + "입니다." );
		
	}

}
