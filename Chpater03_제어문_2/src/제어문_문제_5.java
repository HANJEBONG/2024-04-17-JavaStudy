//import java.util.Scanner;
public class 제어문_문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan=new Scanner(System.in);
		//System.out.print("점수 입력:");
		//int score=scan.nextInt();
		int score=(int)(Math.random()*101);// 0~100
		System.out.println("나의 점수:"+score);
		if(score>0 && score<=100) {
		   char hakjum=' ';
		
		   if(score>=90 && score<=100) {
			   hakjum='A';
		   } 
		   if(score>=80 && score<90) {
			   hakjum='B';
		   }
		   if(score>=70 && score<80) {
			   hakjum='C';
		   }
		   if(score>=60 && score<70) {
			   hakjum='D';
		   }
		   if(score<60) {
			   hakjum='F';
		   }
		
		   System.out.println(hakjum+"학점입니다");
		}
		else {
			System.out.println("잘못된 점수");
		}
		

		
		

	}

}
