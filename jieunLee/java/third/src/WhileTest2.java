public class WhileTest2 {
    public static void main(String[] args) {
        int i = 0;
        while (i++<10) {
            System.out.println("1부터 10까지 출력: " + i);
        }
        i = 0;
        while (++i<10) {
            System.out.println("1부터 9까지 출력: " + i);
        }
    }
}