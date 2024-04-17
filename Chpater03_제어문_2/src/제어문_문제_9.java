import java.util.Scanner;
public class 제어문_문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1~100까지 2자리 정수 입력:");
		int num=scan.nextInt();
		if(num>=10&&num<=99) {
			// 정상적으로 입력이 되었을때
			if(num%11==0) {
				System.out.println("10의자리수와 1의자리수가 같다");
			}
			else {
				System.out.println("10의자리수와 1의자리수가 같지않다");
			}
			
		}
		else {
			System.out.println("잘못된 입력입니다!!");
		}

	}

}
