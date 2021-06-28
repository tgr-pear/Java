package ex100;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// 년, 월, 일을 입력받아 형식에 맞게 출력하는 프로그램을 작성하시오.
		 /* 입력 : 년, 월, 일이 구분되어 입력된다. 
		 	출력 : 입력받은 년, 월, 일을 출력한다.
		  			단, 자리수는 yyyy.mm.dd 형태로 출력한다. */
		 /* 입력 예시 : 2012 / 1 / 3
		 	출력 예시 : 2012.01.03 */
		 /* 도움말 
		  	* printf에서 "%02d"를 사용하면 2칸을 사용하여 출력한다.
		  		1자리 수인 경우 앞에 0을 붙어 출력된다. 
		  	* String result = String.format("%02d",i); 형태를 사용한다. */

			Scanner scan = new Scanner(System.in);
			System.out.println( "원하는 연도를 적으세요.: " );
			int year = scan.nextInt();
			System.out.println( "원하는 월을 적으세요.: " );
			int month = scan.nextInt();
			System.out.println( "원하는 일을 적으세요.: " );
			int day = scan.nextInt();
			
			System.out.print( year + ".");
			System.out.printf( "%02d", month );
			System.out.printf( "." + "%02d", day );
	}

}
