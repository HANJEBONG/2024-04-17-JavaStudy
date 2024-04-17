// 사칙연산 => 연산을 한번만 수행==> 다중 조건문
import java.util.Scanner;
public class 제어문_조건문_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//사용변수
		int num1,num2;
		char op=' ';
		
		System.out.print("첫번째 정수 입력:");
		num1=scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		op=scan.next().charAt(0);
		System.out.print("두번째 정수 입력:");
		num2=scan.nextInt();
		
		if(op=='+') {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		else if(op=='-') {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		else if(op=='*') {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		else if(op=='/') {
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다");
			}
			else {
			    System.out.printf("%d / %d = %.2f\n",num1,num2,(double)num1/num2);
			}
		}
		else {
			System.out.println("잘못된 연산자 입니다");
		}

	}

}
