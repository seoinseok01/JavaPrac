package chap_13;

public class _01_TryCatch {
    public static void main(String[] args){

        try{
            int[] arr =new int[3];
            arr[5] = 100;
            System.out.println("프로그램이 무사히 끝났습니다.");
        } catch(Exception e){
            System.out.println("문제 내용: ");
            e.printStackTrace();
        }
    }
}
