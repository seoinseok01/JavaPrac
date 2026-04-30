package chap_05;

public class practice05_answer {
    public static void main(String[] args){
        //주어진 조건 변수들(값을 바꿔 테스트해 보세요.)
        // 회덮밥 정식 25,000원 / 불고기 피자(L) 32,000원 / 모듬회(대) 99,000원
        String menu = "회덮밥 정식"; //주문 메뉴
        int foodPrice = 25_000;     //음식 가격
        boolean isRaining = false;  //비 오는지 여부
        boolean hasVIPCoupon = false; //VIP 쿠폰 소지 여부
        int deliveryFee = 3000;
        if(isRaining){
            deliveryFee += 1000;
        }else if(foodPrice > 70000){
            deliveryFee = 0;
        } else if(hasVIPCoupon) {
            deliveryFee = 0;
        }
        int totalPrice = foodPrice + deliveryFee;
        System.out.println("주문 메뉴: " + menu);
        System.out.println("주문 금액: "+ foodPrice+"원");
        System.out.println("배달비: "+deliveryFee+"원");
        System.out.println("최종 결제 금액 : "+ totalPrice+"원");
    }
}
