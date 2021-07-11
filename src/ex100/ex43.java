package ex100;

import java.util.ArrayList;
import java.util.Scanner;

public class ex43 {

	public static void main(String[] args) {
		// 숫자를 입력하면 그에 맞는 한글로 변경하시오. 
		  /*  입력 : 양의 정수가 입력으로 주어진다.
		      출력 : 양의 정수를 한글로 출력한다.  */
		  /*  입력 예시 : 123
		      출력 예시 : 백이십삼 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "한글로 변환하고 싶은 수를 입력하세요. : " );
		int num = scan.nextInt();
		
		// 자리수 나누기 _ 배열
		int[] nums = new int[5];
		nums[0] = num / 10000; // 만의 자리수
		nums[1] = ( num/1000 ) % 10; // 천의 자리수
		nums[2] = ( num/100 ) % 10; // 백의 자리수
		nums[3] = ( num/10 ) % 10; // 십의 자리수
		nums[4] = num % 10; // 일의 자리수
		
		// 각 자리에 해당하는 한글 변환
		String sum_str = "";
		for ( int i=0 ; i<5 ; i++ ) {
			if ( nums[i] == 1 ) {
				sum_str = "일";
			}
			if ( nums[i] == 2 ) {
				sum_str = "이";
			}
			if ( nums[i] == 3 ) {
				sum_str = "삼";
			}
			if ( nums[i] == 4 ) {
				sum_str = "사";
			}
			if ( nums[i] == 5 ) {
				sum_str = "오";
			}
			if ( nums[i] == 6 ) {
				sum_str = "육";
			}
			if ( nums[i] == 7 ) {
				sum_str = "칠";
			}
			if ( nums[i] == 8 ) {
				sum_str = "팔";
			}
			if ( nums[i] == 9 ) {
				sum_str = "구";
			}
			
			if ( i==0 && nums[0]>=1 ) { // 만의 자리수에 숫자가 있으면
				sum_str += "만";
			}
			if ( i==1 && nums[1]>=1 ) { // 천의 자리수에 숫자가 있으면
				sum_str += "천";
			}
			if ( i==2 && nums[2]>=1 ) { // 백의 자리수에 숫자가 있으면
				sum_str += "백";
			}
			if ( i==3 && nums[3]>=1 ) { // 만의 자리수에 숫자가 있으면
				sum_str += "십";
			}
			System.out.print( sum_str );
		}
	}
}
