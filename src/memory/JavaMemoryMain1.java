package memory;

public class JavaMemoryMain1 {
    //스택 구조 : 가장 먼저 실행된 메인이 나중에 종료됨
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end"); //ctrl+w 영역선택

    }

    static void method1(int m1){
        System.out.println("method start");
        int cal = m1*2;
        method2(cal);
        System.out.println("method end");
    }

    static void method2(int m2){
        System.out.println("method start");
        System.out.println("method end");

    }

    /*자바 메모리 구조 정리
    * 자바는 스택 영역을 사용해 메서드 호출과 지역변수(매개변수 포함)를 관리함
    * 메서드 계속 호출하면 스택 프레임이 계속 쌓임
    * 지역변수(매개변수 포함)는 스택영역에서 관리
    * 스택 프레임 종료 시 지역변수도 함께 제거
    * 스택 프레임 모두 제거되면 프로그램도 종료
    */

}
