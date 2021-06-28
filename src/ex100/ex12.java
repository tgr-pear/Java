package ex100;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// 하나의 단어를 입력받아 그대로 출력하시오.
		 /* 입력 : 한 단어가 입력된다. 
		  			( 단, 단어의 길이는 50글자 이하이다.)
		 	출력 : 입력받은 단어를 그대로 출력한다. */
		 /* 입력 예시 : informatics
		 	출력 예시 : informatics */
		 /* 도움말 : 문자열은 nextLine()함수를 이용한다.
		  			  String word = scan.nextLine(); */
			
			Scanner scan = new Scanner(System.in);
			System.out.println("하나의 단어를 입력하세요. :");
			String word = scan.nextLine();
			System.out.println( "입력한 단어는 '" + word + "'입니다 ");
	}

}
