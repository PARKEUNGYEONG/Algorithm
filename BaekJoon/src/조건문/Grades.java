package 조건문;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		//첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		
		A = sc.nextInt();
		
		if(100>=A && A>=90) {
			System.out.println("A");
		}else if(89>=A && A>=80) {
			System.out.println("B");
		}else if(79>=A && A>=70) {
			System.out.println("C");
		}else if(69>=A && A>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
			
	}

}