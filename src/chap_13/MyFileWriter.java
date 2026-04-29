package chap_13;

public class MyFileWriter implements AutoCloseable{
    @Override
    public void close() throws Exception{ //파일을 닫는 메서드
        System.out.println("파일을 정상적으로 닫습니다.");
    }
    public void write(String line){ //파일에 내용을 쓰는 메서드
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : "+line);
    }
}
