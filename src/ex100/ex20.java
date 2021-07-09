package ex100;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		// 정수 3개를 입력받아 합과 평균을 출력하는 프로그램을 작성하시오.
		 /* 입력 : 정수 3개를 입력한다.
		 	출력 : 입력받은 정수 3개의 합과 평균을 줄 바꿔 출력한다. */
		 /* 입력 예시 : 1 / 2 / 3
		 	출력 예시 : 6 / 2.0 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "총 정수 3개를 입력합니다." );
		System.out.println( "첫번째 정수를 입력하세요. : " );
		int first = scan.nextInt();
		System.out.println( "두번째 정수를 입력하세요. : " );
		int second = scan.nextInt();
		System.out.println( "세번째 정수를 입력하세요. : " );
		int third = scan.nextInt();
		
		int sum = first + second + third;
		System.out.println( "입력하신 3개 정수의 합은 : " + sum );
		float average = (float) (sum / 3.0) ;
		System.out.println( "입력하신 3개 정수의 평균은 : " + average );

	}

}
