package ref;

public class NullMain2 {
    public static void main(String[] args) {
        //1. 지역변수가 null 인 경우의 NullPointerException

        Data data = null;
        data.value = 10; //nullPointerException 예외 발생
        /*data에 든 참조값을 통해 객체를 찾아야 하는데,
          data가 null 이므로 예외 발생 (null.value가 됨) */

        //예외 발생하는 순간 빠져나가므로 출력문은 실행x
        System.out.println("data = " + data.value);
    }
}
