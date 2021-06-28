package ex100;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// 시간이 특정 형식에 맞추어 입력될 때 그대로 출력하는 프로그램을 작성하시오.
		 /* 입력 : 시(hour)와 분(minute)이 구분되어 입력된다.
		   			시와 분은 두 개의 정수로 입력받는다.
		 	출력 : 입력받은 시간을 "시:분"으로 출력한다. */
		 /* 입력 예시 : 3
		  				16
		 	출력 예시 : 3:16 */
		 /* 도움말 : Scanner를 이용하여 2개의 변수를 따로 받아서 처리한다. */
			
			Scanner scan = new Scanner(System.in);
			System.out.println("원하는 시(hour)를 입력하세요. :");
			int hour = scan.nextInt();
			System.out.println("원하는 분(minute)을 입력하세요. :");
			int minute = scan.nextInt();
			
			System.out.println( hour + ":" + minute );
	}

}
