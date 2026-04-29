package chap_13;

public class _05_TryWithResources {
    public static void main(String[] args){
        try (MyFileWriter writer = new MyFileWriter()){
            writer.write("빵이 먹고 싶어요.");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
