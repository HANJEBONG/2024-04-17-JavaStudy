/*
 *  정수 2개와 연산자를 입력받아 사칙 연사하는 프로그램을 만들어라
 *  (다중조건문 사용)
 */

//import java.util.Scanner;
public class 제어문_문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan=new Scanner(System.in);
		char op=' ';
		//System.out.print("정수 입력:");
		int num1=(int)(Math.random()*100)+1;//scan.nextInt();
		
		//System.out.print("+,-,*,/ 입력:");
		int ops=(int)(Math.random()*4);//scan.next().charAt(0);
		
		//System.out.print("정수 입력:");
		int num2=(int)(Math.random()*100)+1;//scan.nextInt();
		
		if(ops==0) op='+';
		else if (ops==1) op='-';
		else if (ops==2) op='*';
		else if (ops==3) op='/';
		
		int num3=0;
		
		if(op=='+') num3=num1+num2;
		else if(op=='-') num3=num1-num2;
		else if(op=='*') num3=num1*num2;
		else if(op=='/') num3=num1/num2;
		
		System.out.printf("%d %c %d = %d",num1,op,num2,num3);
		//프로그램 => 개발(x) , 유지보수 (재사용) => 수정/추가
				
		
//		if(op=='+') {
//			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
//		}
//		else if(op=='-') {
//			System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
//		}
//		else if(op=='*') {
//			System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
//		}
//		else if(op=='/') {
//			System.out.printf("%d / %d = %.2f\n",num1,num2,(double)num1/num2);
//		}
		

	}

}
