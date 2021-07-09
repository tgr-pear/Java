package ex100;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		// 10진수 정수 하나를 입력받아 아스키문자로 출력되는 프로그램을 작성하시오.
		 /* 입력 : 10진수가 1개 입력된다.
		   			( 단, 입력되는 정수는 0 ~ 255 범위이다. )
		 	출력 : 입력받은 10진수에 해당하는 아스키코드를 출력한다. */
		 /* 입력 예시 : 65
		 	출력 예시 : A */
			
			Scanner scan = new Scanner(System.in);
			System.out.println( "10진 정수 하나를 입력하세요. : ");
			int num = scan.nextInt();
			char alphabet = (char) num;
			System.out.println( alphabet );

	}

}
