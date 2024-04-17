/*
 * 웹=>
 *  => 로그인 / 아이디중복 / 아이디찾기 / 비밀번호 찾기 / 검색 / 우편번호
 */

import java.util.Scanner;
public class 제어문_문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.print("정수 하나를 입력하시오.");
		num=scan.nextInt();
        
		if(num>0){
			System.out.println(num+"는(은) 양수입니다");
		}
		else if(num<0) {
			System.out.println(num+"는(은) 음수입니다");
		}
		else {
			System.out.println(num+"는(은) 0입니다");
		}

	}

}
