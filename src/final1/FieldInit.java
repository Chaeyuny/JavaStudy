package final1;

public class FieldInit {

    static final int CONST_VALUE = 10; //static final 상수 = 대문자 변수
    final int value = 10;

    //선언 시 초기화 되었으므로 생성자에서 값 할당 불가


    /* 상수 특징
    * static final 키워드 사용
    * 대문자를 사용하고 구분은 _로 함 (일반 변수와 구분하기 위해)
    * 필드를 직접 접근해서 사용
      - 상수는 기능이 아니라 고정값 자체를 사용하는 것이 목적
      - 상수는 값을 변경할 수 없으므로 필드에 직접 접근해도
        데이터가 변하는 문제는 발생 x
    * */
}
