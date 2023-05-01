package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BR {

	public static void main(String[] args)throws IOException {
		//BufferedReader (== Scanner)
		//BufferedWriter (== System.out.println) 
		//readLine()은 입력값으로 들어온 데이터를 한 줄로 읽어서 String으로 바꾸는 메소드입니다.무조건 한 줄만 읽는다
		//Scanner 보다 속도 빠름! ( == 성능 좋음, 시간 단축), 많은 양의 데이터 처리할 때 유용
		//동기화 되기 때문에 *멀티 쓰레드 환경에 안전
		//import 필수
		//입력값은 String 형태로 고정 -> 형변환 필수
		//예외처리 반드시 필요  -> throws IOException
		
		
		//입력 : 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
		//출력 : 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;//
		
		int T = Integer.parseInt(br.readLine());
		int a,b;
		
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			bw.write(a+b+"\n");
		}
		
	
		bw.flush();
		br.close();
		bw.close();
		
		
		
		

	}

}
