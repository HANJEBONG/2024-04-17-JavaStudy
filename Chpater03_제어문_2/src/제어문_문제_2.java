/*
 *  한 개의 정수를 3의 배수인지 아닌지 판단
 */

import java.util.Scanner;
public class 제어문_문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		if(num%3==0 && num!=0) {
			System.out.println(num+"은(는) 3의 배수입니다");
		}
		else {
			System.out.println(num+"은(는) 3의 배수가 아닙니다");
		}

	}

}
