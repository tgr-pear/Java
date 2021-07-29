package ex100;

import java.util.Scanner;

public class ex51 {

	public static void main(String[] args) {
		// 밑의 조건을 만족하는 프로그램을 작성하시오. 
		 /* 조건 : 휴지통이 n만큼 차면 알아서 쓰레기를 압축
		  * 압축하는 알고리즘
		  	10의 자리수와 1의 자리수를 서로 바꾼 후 2를 곱한다.
		  	  단, 수치가 100을 넘으면 100의 자리수는 무시한다. */
		/*  입력 : 휴지통의 자동 압축 기준 수치(n)이 입력된다. ( 1<=n<=99 )
	      	출력 
	      	  첫째줄에 휴지통을 압축했을 때 양을 출력한다.
	      	  둘째줄에 그 양이 50 이하면 "Good!" / 50이 넘으면 을 출력한다. */
		/*  입력 예시 : 90
	      	출력 예시 : 18 / "Good!" */

		Scanner scan = new Scanner(System.in);
		System.out.println( "1 - 99 사이의 정수를 하나 입력하세요.");
		int waste = scan.nextInt();
		
		int num1 = waste / 10 ; // 십의 자리수
		int num2 = waste % 10 ; // 일의 자리수
		// System.out.println( "waste num1 : " + num1 );
		// System.out.println( "waste num2 : " + num2 );
		
		int temp = num1;
		num1 = num2; 
		num2 = temp;
		// System.out.println( "num1 : " + num1 );
		// System.out.println( "num2 : " + num2 );
		
		int paste = ( (num1*10) + num2 ) * 2;
		
		System.out.println( paste );
		
		if ( paste <= 50 ) {
			System.out.println( "Good!" );
		} else {
			System.out.println( "Oh My God!!!" );
		}
		
	}

}
