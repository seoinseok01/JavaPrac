package chap_05;

public class practice05 {
    public static void main(String[] args){

        boolean weather = true; //날씨 맑음
        boolean vip = true; // vip 쿠폰 있음
        int price = 0; //주문 금액 ( 70000원 넘으면 날씨와 관계없이 배달비 0원)
        int del;
        int sum = 0;






        System.out.println("# 상황 1 : 날씨 맑음, VIP 쿠폰 없음 -> 기본 배달비 적용");
        price = 25000;
        del = 3000;
        sum = price + del;
        if(weather == false){
            del += 1000;
        }else if(price >70000 || !vip) {
            del = 0;
        } else del = 3000;
        System.out.println("주문 메뉴 : 회덮밥 정식");
        System.out.println("주문 금액 :" + price);
        System.out.println("배달비 : "+ del);
        System.out.println("최종 결제 금액 : " + sum);

        System.out.println("# 상황 2 : 날씨 비, VIP 쿠폰 있음 -> 배달비 0원 적용(최우선)");
        price = 32000;
        del = 3000;
        if(weather == false){
            del += 1000;
        }else if(price >70000 || !vip) {
            del = 0;
        }else del = 3000;
        sum = price + del;

        System.out.println("주문 메뉴 : 불고기 피자(L)");
        System.out.println("주문 금액 :" + price);
        System.out.println("배달비 : "+del);
        System.out.println("최종 결제 금액 : " + sum);

        System.out.println("# 상황  3: 날씨 비, VIP 쿠폰 없음 -> 주문금액 70,000원 초과로 배달비 무료");
        price = 99000;
        del = 3000;
        if(weather == false){
            del += 1000;
        }else if(price >70000 || !vip) {
            del = 0;
        }else del = 3000;
        sum = price + del;

        System.out.println("주문 메뉴 : 모둠회(대)");
        System.out.println("주문 금액 :" + price);
        System.out.println("배달비 : "+del);
        System.out.println("최종 결제 금액 : " + sum);
    }
}
