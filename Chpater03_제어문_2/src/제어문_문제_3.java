import java.util.Scanner;
public class 제어문_문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int a=scan.nextInt();
		
		/*if(a>0) {
			System.out.println("a="+a);
		}
		else {
			System.out.println("a="+(a*-1));
		}
		*/
		System.out.println("a="+Math.abs(a));// 양수만 출력 => 절대값

	}

}
