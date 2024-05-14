package ref;

public class InitMain {
    //멤버변수 자동 초기화 테스트
    public static void main(String[] args) {
        InitData data = new InitData();

        //초기화 x
        System.out.println("value1 = " + data.value1);
        //초기화 o
        System.out.println("value2 = " + data.value2);
    }
}
