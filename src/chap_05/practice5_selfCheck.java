package chap_05;

public class practice5_selfCheck {
    public void situation01(){
        System.out.println("상황 1 : 17세, 지역 주민인 경우");
        int age = 17;
        boolean isLocalResident = true;
        int fee;
        if(age<13){fee = 10000;}
        else if(age>=13 && age<19){fee = 20000;}
        else {fee=30000;}

        if(isLocalResident){
            System.out.println("지역 주민 할인이 적용되었습니다.");
            fee /= 2;
        }
        System.out.println("최종 결제 금액은"+ fee+"입니다.");
    }
    public void situation02(){
        System.out.println("상황 2 : 17세, 지역 주민이 아닌 경우");
        int age = 12;
        boolean isLocalResident = true;
        int fee;
        if(age<13){fee = 10000;}
        else if(age>=13 && age<19){fee = 20000;}
        else {fee=30000;}

        if(!isLocalResident){
            System.out.println("지역 주민 할인이 적용되었습니다.");
            fee /= 2;
        }
        System.out.println("최종 결제 금액은"+ fee+"입니다.");
    }
    public void situation03(){
        System.out.println("상황 3 : 21세, 지역 주민인 경우");
        int age = 21;
        boolean isLocalResident = true;
        int fee;
        if(age<13){fee = 10000;}
        else if(age>=13 && age<19){fee = 20000;}
        else {fee=30000;}

        if(isLocalResident){
            System.out.println("지역 주민 할인이 적용되었습니다.");
            fee /= 2;
        }
        System.out.println("최종 결제 금액은"+ fee+"입니다.");
    }
}
