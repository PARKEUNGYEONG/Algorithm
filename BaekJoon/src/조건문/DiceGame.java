
package 조건문;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		// 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
		//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
		//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 	
		//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
		//3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		//입력 : 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
		//출력 : 첫째 줄에 게임의 상금을 출력 한다.
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		int max = A;
		if(max < B) {
			max = B;
		}
		if(max<C){
			max = C;
		}
		
		
		if(A==B && B==C) {
			System.out.println(10000+A*1000);
		}else if(A==B || A==C ){
			System.out.println(1000+A*100);	
		}else if(B==C) {
			System.out.println(1000+B*100);	
		}else {
			System.out.println(max*100);
		}
	}

}