class Solution {
    public int solution(int chicken) {
        int orderChicken = chicken; 
        int coupon = 0; //쿠폰으로 시킨 치킨
        
        //시킨 치킨 10마리 미만일 때까지
        while(orderChicken >= 10){
            int saveCoupon = orderChicken % 10; //10개 미만의 쿠폰 저장
            coupon += (orderChicken / 10);
            orderChicken = (orderChicken / 10) + saveCoupon; 
        }
        return coupon;
    }
}