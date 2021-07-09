package ex100;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// 영문자 하나를 입력 받아 아스키코드 10진수값으로 출력하는 프로그램을 작성하시오.
		 // ASCII코드 : 영문자, 특수문자 등을 사용할 떄 사용하는 표준코드.
		 /* 입력 : 영문자 한 개가 입력된다.
		 	출력 : 입력받은 문자에 해당하는 아스키코드 값을 10진수로 출력한다. */
		 /* 입력 예시 : A
		 	출력 예시 : 65 */
		 /* 도움말 
		  	 String 클래스의 charAt(index i) 메소드를 사용하여 
		  	 	char형 문자 한 개를 char에 입력할 수 있다.
			 예)  String str = scanner.nextLine();
				  char c = str.charAt(0); //인덱스 0(첫번째) 문자를 가져옴. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "원하는 영문자 하나를 입력하세요. : ");
		String text = scan.nextLine();
		char alphabet = text.charAt(0); 
		int num = alphabet;
		System.out.println( num );
		
	}

}
