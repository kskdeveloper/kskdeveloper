import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char [] toChar = a.toCharArray();
		 
		for(int i = 0 ; i < a.length(); i++) {
			if(Character.isUpperCase(toChar[i])) {
				toChar[i] =	Character.toLowerCase(toChar[i]);
			} else {
				toChar[i] = Character.toUpperCase(toChar[i]);
			}
			
		}
		String result = new String(toChar);
		System.out.print(result);
    }
}