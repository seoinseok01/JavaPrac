package chap_04;

public class practice {
    public static void main(String[] args){
        String pw = "별들이 제자리를 찾을 무렵, --START--숨겨진 [KEYWORD]의 위치를 기억하라--END--";

        String originalPw = pw.substring(
                (pw.indexOf("--START--") + "--START--".length()),
                pw.indexOf("--END--"));
        String decryptedPw = originalPw.replace("[KEYWORD]", "지혜의 샘");

        System.out.println("[암호 해독 결과]");
        System.out.println("원본 암호 : " + originalPw);
        System.out.println("해독된 문장 : " + decryptedPw);

    }
}
