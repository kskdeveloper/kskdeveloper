import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[]args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//총 몇명 비교할 것인지
		int N = Integer.parseInt(br.readLine());
		
		//키, 몸무게 2차원 배열
		int [][] arr = new int[N][2];
		
		//키, 몸무게 값 받기
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//등수 지정하기
		for(int i =0 ; i<N; i++) {
			//기준 등수
			int rank = 1;
			
			for(int j =0; j<N; j++) {
				//자신과 동일한 배열은 다음 for문으로 넘어가라
				if(i==j) {
					continue;
				}
				//i와 j값 다를 때 키와 몸무게 둘다 비교
				else if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					//i를 N개의 j배열과 비교하여 j가 크다면 ++ 아니라면 다음 j로 넘어가서 비교
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
	}
}