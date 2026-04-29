package chap_04;

public class selfCheck4 {
    public static void main(String[] args){
        String email = "nadocoding@gamil.com";
        int index = email.indexOf("@");

        String ID = email.substring(0,index);
        String domain = email.substring(index+1);

        System.out.println("이메일 아이디 : " + ID);
        System.out.println("이메일 도메인 : " + domain);
    }
}
