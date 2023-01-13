import java.util.Arrays;
import java.util.Scanner;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    
    //시험 본 과목 개수
    int N = sc.nextInt();
    
    //점수 담을 배열
    double scoreArr [] = new double[N];
    
    //과목 수 만큼 점수 입력
    for(int i = 0; i<scoreArr.length;i++) {
    	scoreArr[i] = sc.nextDouble();
    }
    
    //오름차순 정렬
    Arrays.sort(scoreArr);

    //총 점수 합
    double totalScore =0.0;
    
    for(int i=0;i<scoreArr.length;i++) {
    	totalScore = totalScore + ((scoreArr[i] / scoreArr[N-1])*100);
    }
    
    //총 평균
    System.out.println(totalScore/scoreArr.length);
    
  } 
}