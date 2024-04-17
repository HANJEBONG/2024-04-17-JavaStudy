import java.util.Scanner;
public class 제어문_문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입력:");
		int score=scan.nextInt();
		if(score>0 && score<=100) {
		   char hakjum=' ';
		
		   if(score>=90) {
			   hakjum='A';
		   } 
		   else if(score>=80) {
			   hakjum='B';
		   }
		   else if(score>=70) {
			   hakjum='C';
		   }
		   else if(score>=60) {
			   hakjum='D';
		   }
		   else {
			   hakjum='F';
		   }
		
		   System.out.println(hakjum+"학점입니다");
		}
		else {
			System.out.println("잘못된 점수");
		}
		

		
		

	}

}