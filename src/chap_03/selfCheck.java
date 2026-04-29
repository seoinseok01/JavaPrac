package chap_03;

public class selfCheck {
    public static void main(String[] args){
        int price = 30_000;
        int coupon = 5_000;
        int totalPrice = price - coupon;
        boolean applyFreeShipping = totalPrice > 20_000;

        System.out.println("최종 결재 금액 : " + totalPrice);
        System.out.println("무료 배송 적용 여부 : " + applyFreeShipping);
    }
}
