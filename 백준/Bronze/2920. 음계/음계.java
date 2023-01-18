import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
	  
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[8];
		for(int i =0; i<8;i++) {
			num[i] = sc.nextInt();
		}
		
		String music = "";
		for(int i=0;i<num.length-1;i++) {
			if(num[i]+1 ==num[i+1]) {
				music = "ascending";
			}
			else if(num[i]-1 ==num[i+1]) {
				music = "descending";
			}
			else {
				music = "mixed";
				break;
			}
		}
		System.out.println(music);
	}
}