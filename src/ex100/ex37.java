package ex100;

import java.util.Scanner;

public class ex37 {

	public static void main(String[] args) {
		/* 길이 n이 입력되면 길이가 n인 정사각형을 출력하시오.
		 	단, 정사각형은 * 모양으로 채운다. */
		 /* 입력 : 정사각형의 길이 n이 입력된다.
		 	출력 : 길이 n인 정사각형을 출력한다 */
		 /* 입력 예시 : 2
		 	출력 예시 : **
		  				**  */
		
		Scanner scan = new Scanner(System.in);
		System.out.print( "숫자 하나를 입력하세요. : " );
		int n = scan.nextInt();
		
		for ( int i=1 ; i<=n ; i++ ) {
			for ( int j=1 ; j<=n ; j++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
