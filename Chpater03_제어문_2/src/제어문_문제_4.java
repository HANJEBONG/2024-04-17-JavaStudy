import java.util.Scanner;
public class 제어문_문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int year;
		System.out.print("년도 입력:");
		year=scan.nextInt();
		
		if((year%4==0 && year%100!=0)||(year%400==0)) {
			System.out.println(year+"년도는 윤년입니다");
		}
		else {
			System.out.println(year+"년도는 윤년이 아닙니다");
		}

	}

}
