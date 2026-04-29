package chap_14;

import java.io.*;

public class _07_ReadWriteFile {
    public static void main(String[] args){
        try(BufferedWriter bw =
                new BufferedWriter(new FileWriter("goodjob.txt"))){
            bw.write("1. 이제 거의 끝이 보임띠 ");
            bw.newLine();
            bw.write("2. 여기까지 오신 여러분 정말 대단해요");
            bw.newLine();
        } catch(IOException e){
            throw new RuntimeException (e);
        }
    }
}
