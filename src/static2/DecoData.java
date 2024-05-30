package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;


    /*static 메서드 사용법
      : static 메서드 안에서는 static만 사용 가능
      : 클래스 내부 기능 사용 시 정적 메서드는 static이 붙은 정적 메서드, 정적 변수만 사용 가능
      : 인스턴스 변수, 인스턴스 메서드는 사용 불가

      -> 반대로 모든 곳에서 static 변수, static 메서드 호출 가능(공용 기능이므로)
     */


    //정적 메서드
    public static void staticCall(){
//        instanceValue++; //인스턴스 변수 접근 불가, compile error
//        instanceMethod(); //인스턴스 메서드 접근 불가, compile error
        //인스턴스 변수, 참조값은 인스턴스를 생성해야 알 수 있음 -> 메모리 영역


        staticValue++; //정적 변수 접근, 같은 클래스 소속이므로 접근가능
        staticMethod(); //정적 메서드 접근
    }


    //인스턴스 메서드
    public void instanceCall(){
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        //원본은 DecoData.staticValue. 자기 클래스이므로 생략 가능함
        staticValue++;  //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }
    private void instanceMethod(){
        System.out.println("instanceValue=" + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue="+staticValue);
    }

    /*정적 메서드가 인스턴스 기능 사용할 수 없는 이유
    *  : 정적 메서드는 클래스 이름을 통해 바로 호출 가능
    *     즉, 인스턴스처럼 참조값의 개념이 없음
    *    특정 인스턴스 기능을 사용하려면 참조값을 알아야 하는데,
    *    정적 메서드는 참조값 없이 호출하므로 이 안에서는 인스턴스 변수와 메서드를 사용할 수 없음
    *
    *  단, 매개변수로 참조값을 직접 전달받는다면 인스턴스 사용 가능
    * */


}
