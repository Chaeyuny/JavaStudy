package static2;

//static 편하게 사용할 수 있도록 import
// ->static 메서드 여러개면 마지막 *로 변경가능
import static static2.DecoData.staticCall;

public class DecoDataMain {


    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); //객체생성없이 호출가능

        /*프로그램 내에서 static을 여러번 쓸 경우 생김
          --> 매번 클래스명 쓰기 번거로우므로 import 가능
        */
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall(); //1에서 이미 staticValue =1 이므로 2가 되어 출력

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData(); //인스턴스가 새로 생기므로 instanceValue=1
        data2.instanceCall(); //공용 변수 staticValue=3 (메서드 영역에 존재)

    }
}
