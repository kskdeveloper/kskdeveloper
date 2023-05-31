class Solution {
    public String solution(String polynomial) {
       	//계수 상수 저장용
		int xNum = 0;
		int num = 0;
		String [] arr = polynomial.split(" +");

		for(String str : arr) {
			if(str.equals("x")) {
				xNum += 1;
			} else if(str.contains("x")) {
				xNum += Integer.parseInt(str.substring(0, str.length()-1)); //끝자리 x만 자르기(0, 몇개)
                System.out.println(xNum);
			} else if(!str.equals("+")) { //숫자부분
				num += Integer.parseInt(str);
			}	
		}
		
		String result = "";
		if(xNum !=0 && num ==0) {		
			if(xNum == 1) {
				result = "x";
			} else {
				result = xNum + "x";
			}
		}
		
		if(xNum !=0 && num !=0) {
			if(xNum == 1) {
				result = "x" + " + " + num;
			} else {
				result = xNum + "x" + " + " + num;
			}
		}
		
		if(xNum ==0 && num !=0) {
			result = String.valueOf(num);
		}
        
        return result;
    }
}