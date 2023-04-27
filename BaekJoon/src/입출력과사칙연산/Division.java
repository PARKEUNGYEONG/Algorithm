package 입출력과사칙연산;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		Double A,B;
		
		A =sc.nextDouble();
		B= sc.nextDouble();
		
		System.out.println(A/B);
		
		sc.close();

	}

}