import java.util.Scanner;
public class 제어문_문제_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("달 입력:");
		int month=scan.nextInt();
		if(month>=1 && month<=12) {
			if(month>=3 && month<=5) {
				System.out.println("봄입니다");
			}
			else if(month>=6 && month<=8) {
				System.out.println("여름입니다");
			}
			else if(month>=9 && month<=11) {
				System.out.println("가을입니다");
			}
			else {
				System.out.println("겨울입니다");
			}
			
		}
		else {
			System.out.println("잘못된 입력 입니다!!!");
		}

	}

}
