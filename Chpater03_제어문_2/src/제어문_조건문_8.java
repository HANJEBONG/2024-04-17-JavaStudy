import java.util.Scanner;
// 숫자를 입력 받아서 => 3의 배수 , 5의 배수 , 7의 배수
// 조건 여러개를 동시에 수행 => 단일 조건문
// 조건 한개만 수행 => 다중 조건문
public class 제어문_조건문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int num;
		
		System.out.print("정수를 입력:");
		num=scan.nextInt();
		
		if(num%3==0) {
			System.out.println(num+"은(는)3의 배수");
		}
		if(num%5==0) {
			System.out.println(num+"은(는)5의 배수");
		}
		if(num%7==0) {
			System.out.println(num+"은(는)7의 배수");
		}
		
	    if(num%3!=0 && num%5!=0 && num%7!=0) {
			System.out.println("해당사항없음");
	    }
	    
		/*else {
			System.out.println("해당사항없음");
		}
		*/		

	}

}
