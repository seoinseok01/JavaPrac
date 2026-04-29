package chap_03;

public class prctice {
    public static void main(String[] args){
        int a = 68;
        int b = 75;
        int c = 72;

        int D = a>b ? a : b;
        int E = c > D ? c : D;
        System.out.println("꼴지의 몸무게는 "+ E+"kg 입니다.");
    }
}
