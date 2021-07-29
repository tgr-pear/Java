package ex100;

import java.util.Scanner;

public class ex50 {

	public static void main(String[] args) {
		// 몸무게와 신장을 입력하면 BMI수치를 계산하여 비만을 판단하는 프로그램을 작성하시오. 
		 /* BMI 지수  = 몸무게  / ( 신장 / 100 * 신장  / 100 )
		    BMI에 따른 비만 판정 
		  	   BMI 수치     |  비만 판정  
		  	    ~ 20    |   저체중   
		  	  20 ~ 24   |  정상체중
		  		25 ~    | 	과체중   */
		/*  입력 : 몸무게와 키를 입력받는다.
	      	출력 : 입력받은 데이터를 기준으로 비만을 판단한다. */
		/*  입력 예시 : 60 / 160 
	      	출력 예시 : 정상입니다. */
		
		System.out.println( "몸무게와 키를 입력받아 비만을 판단하는 프로그램입니다." );
		Scanner scan = new Scanner(System.in);
		System.out.println( "몸무게를 입력하세요. : " );
		float weight = scan.nextInt();
		System.out.println( "키를 입력하세요. : " );
		float height = scan.nextInt();
		
		float bmi = weight / ( (height/100) * (height/100) );
		
		if ( bmi < 20 ) {
			System.out.print( bmi );
			System.out.println( "저체중입니다." );
		} else if ( bmi < 24 ) {
			System.out.print( bmi );
			System.out.println( "정상체중입니다." );
		} else {
			System.out.print( bmi );
			System.out.println( "과체중입니다." );
		}
	}

}
