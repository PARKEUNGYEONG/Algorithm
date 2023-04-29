package 반복문;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		//문제 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		//입력 : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
		//출력 : 1부터 n까지 합을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int sum=0;
		//sum이 for문 안에 들어가있으면 for 문 밖에서 sum값을출력할수 없으므로 for문 밖에서선언한다.
		
		for(int i=1;i<=n;i++) {
			sum = i + sum;
		}
		System.out.println(sum);
		//System.out.println(sum);이 for문 안에 있으 1부터 n까지나열되서 출력되기 때문에 for문밖에서 입력해야햐한다.

	}

}
