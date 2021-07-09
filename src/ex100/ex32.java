package ex100;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		// 평가를 문자로 입력받아 내용을 다르게 출력하시오.
		 /* 평가내용
		  *  D : slowly~
		  *  C : run!
		  *  B : good!!
		  *  A : best!!!
		  *  나머지 문자들 : what??
		  */
		 /* 입력 : 영문자 1개가 입력된다. 
		 	출력 : 평가 내용마다 다른 내용이 출력된다. */
		 /* 입력 예시 : A 
		 	출력 예시 : best!!! */
		 /* 도움말 : switch - case문을 사용하여 작성하시오.
		  		break; 를 사용하지 않으면 이후의 명령들도 계속 실행된다.
		  		default: ; 제시된 case가 아닌 모든 경우에 실행된다.
		  		switch ( int ) 값만 가능 / char 도 정수값이기에 가능
		  		 -> char ch = scan.next().charAt(); 형태로 불러오면 된다. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "영문자 하나를 입력하세요. ( A ~ D ) :" );
		char text = scan.nextLine().charAt(0);
		
		switch ( text ) {
		case 'A' : 
			System.out.println( "best!!!" );
			break;
		case 'B' : 
			System.out.println( "good!!" );
			break;
		case 'C' : 
			System.out.println( "run!" );
			break;
		case 'D' : 
			System.out.println( "slowly~" );
			break;
		default : 
			System.out.println( "what??" );
			break;
		}

	}

}
 