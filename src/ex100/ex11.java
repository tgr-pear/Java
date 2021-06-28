package ex100;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// 두 개의 문자를 입력받은 후 순서를 바꿔 출력하시오.
		 /* 입력 : 두 개의 문자가 차례대로 입력된다.
		 	출력 : 입력한 두 문자의 순서를 바꿔 출력한다. */
		 /* 입력 예시 : A 
		  				b
		 	출력 예시 : b A */
		 /* 도움말 : Scanner 클래스를 이용하여 2개의 문자값을 입력받고, 
		   				출력되는 순서를 바꿈으로써 해결할 수 있다. */
			Scanner scan = new Scanner(System.in);
			System.out.println("문자 하나를 입력하세요.: ");
			String first = scan.next();
			System.out.println("문자 하나를 입력하세요.: ");
			String second = scan.next();
			
			System.out.print( second + " " + first );
		
	}

}
