package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {

        //멤버변수와 메서드가 모두 정의된 클래스로 코드 작성
        ValueObject valueObject = new ValueObject();

        //객체에 접근하면 메서드도 사용할 수 있다
        // --> 메서드를 통해 자신의 멤버변수에 접근할 수 있다
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자 = " + valueObject.value);
    }
}
