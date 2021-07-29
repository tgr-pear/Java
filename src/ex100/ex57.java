package ex100;

import java.util.Scanner;

public class ex57 {

	public static void main(String[] args) {
		// 입력을 받아 아래의 조건을 만족하도록 출력하는 프로그램을 만드시오.
		 /* 조건 
		  	2메뉴 칼로리의 합이 500보다 크면 "Angry" / 500보다 작으면 "No Angry"를 출력
		  	- 메뉴 - 
		  	1. 치즈버거 : 400cal
		  	2. 야채버거 : 340cal
		  	3. 우유 : 170cal
		  	4. 계란말이 : 100cal
		  	5. 샐러드 : 70cal
		 */
		 /*  입력 : 메뉴의 번호가 차례로 2개 입력된다. 
	      	 출력 : 입력된 2개 메뉴의 칼로리를 계산해서 
		  				500보다 크면 "Angry" / 500보다 작으면 "No Angry"를 출력한다. */
		 /*  입력 예시 : 3 / 5
	      	 출력 예시 : 240cal */
		
		Scanner scan = new Scanner(System.in);
		
	
		System.out.println( "첫번째 메뉴를 입력하세요.(1-5) " );
		int one = scan.nextInt();
		System.out.println( "두번째 메뉴를 입력하세요.(1-5) " );
		int two = scan.nextInt();
		
		int cal = 0;
		
		switch ( one ) {
		case 1 : 
			cal += 400; 
			break;
		case 2 : 
			cal += 340; 
			break;
		case 3 : 
			cal += 170; 
			break;
		case 4 : 
			cal += 100; 
			break;
		case 5 : 
			cal += 70; 
			break;
		default : 
			System.out.println( "해당하지 않는 숫자입니다." ); 
			break;
		}
		
		switch ( two ) {
		case 1 : 
			cal += 400; 
			break;
		case 2 : 
			cal += 340; 
			break;
		case 3 : 
			cal += 170; 
			break;
		case 4 : 
			cal += 100; 
			break;
		case 5 : 
			cal += 70; 
			break;
		default : 
			System.out.println( "해당하지 않는 숫자입니다." ); 
			break;
		} 
	
	/*
		int cal = 0;
		for ( int i=1 ; i<3 ; i++ ) {
			System.out.print( i + "번째 메뉴를 입력하세요.(1-5) :");
			int menu = scan.nextInt();
			System.out.println(" ");
			
		  switch (menu) {
			case 1 : 
				int cheeze = 400;
				cal += cheeze; 
				break;
			case 2 : 
				int veget = 340;
				cal += veget; 
				break;
			case 3 : 
				int milk = 170;
				cal += milk; 
				break;
			case 4 : 
				int egg = 100;
				cal += egg; 
				break;
			case 5 : 
				int salad = 70;
				cal += salad; 
				break;
			default : 
				System.out.println( "해당하지 않는 숫자입니다." ); 
				break;
			}
		}
	*/	
		
		System.out.println( "입력한 2개의 총 칼로리는 " + cal + "입니다." );
		
		if ( cal <= 500 ) {
			System.out.println( "No Angry! :)" );
		} else {
			System.out.println( "Angry! :(" );
		}
	}

}
