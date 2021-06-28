package ex100;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		/* 하나의 실수(float)를 입력받아 
			소수점 아래 3째자리에서 반올림하여 2째자리까지 출력하시오. */
		 /* 입력 : 실수 한 개가 입력된다. 
		 	출력 : 입력받은 실수를 소수점 아래 3째자리에서 반올림하여 2째자리까지 출력한다. */
		 /* 입력 예시 : 1.59254
		 	출력 예시 : 1.59 */
		 /* 도움말 
		  	  1. float num = scan.nextFloat(); 를 통해 실수값을 입력 받을 수 있다. 
		  	  2. float으로 변수를 선언한 경우 %.2f로 출력하면 
		  		  소수점 3째자리에서 반올림하여 2째자리까지 출력할 수 있다. → printf("%.2f",num) 
		  	 또는 0.005f를 더하여, 100을 곱한 후 (int)로 타입을 변경 후, 100으로 나눠도 된다. */
			
			Scanner scan = new Scanner(System.in);
			System.out.println( "소수점 3째자리에서 반올림합니다." );
			System.out.println( "실수 하나를 입력하세요. : " );
			float num1 = scan.nextFloat();
			
			System.out.printf("%.2f",num1);
			
			System.out.println(" ");
			
			System.out.println( "실수 하나를 입력하세요. : " );
			float num2 = scan.nextFloat();
			num2 = (num2 + 0.005f) * 100 ;
			int f = (int) num2;
			num2 = (float) f/100;
			System.out.println( num2 );
			
	}

}
