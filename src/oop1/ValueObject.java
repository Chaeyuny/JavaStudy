package oop1;

public class ValueObject {
    /*멤버변수와 메서드가 모두 정의된 클래스
      : 속성과 기능이 한 곳에 뭉쳐있다 */

    //데이터(멤버변수, 필드) 정의
    int value;

    //클래스 내에 데이터 사용하는 기능(메서드) 정의

    /* 클래스 내에서 만드는 메서드에는 static 키워드 사용하지 않음
       : 메서드는 객체를 생성해야 호출할 수 있지만, static이 붙으면
         객체를 생성하지 않고도 메서드를 호출할 수 있기 떄문 */
    void add(){
        value++;
        System.out.println("숫자 증가 value = "+value);
    }
}
