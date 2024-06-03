package final1;

public class FinallocalMain {

    public static void main(String[] args) {
        //final 지역변수
        final int data1;
        data1 = 10; // 최초 한 번만 할당 가능
        //data1 =20; //컴파일 오류 발생

        //final 지역변수2
        final int data2 = 10; //선언 시 초기화
        //data2 = 20; //컴파일 오류
    }

    static void method(final int parameter){
        //parameter = 20;  컴파일 오류

        //매개변수에 final이 붙으면 내부에서는 매개변수 값 변경 불가
        //메서드 호출 시점에 사용된 값이 끝까지 사용됨
    }
}
