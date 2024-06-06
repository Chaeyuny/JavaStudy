package poly.ex5;

public interface InterfaceAnimal {
    /*인터페이스
     : 순수 추상 클래스를 더 편리하게 사용할 수 있도록 해주는 기능
     : 순수 추상 클래스의 특징 가짐(인스턴스 생성x, 상속 시 모든 메서드 오버라이딩 필수, 다형성 위해 사용)
     : 인터페이스의 메서드는 모두 public, abstract -> 생략가능, 권장함
     : 다중 구현(다중 상속) 지원
    */

    //모든 메서드를 추상화 해야할 때 interface 사용 (순수 추상 클래스와 동일)
    void sound(); //public abstract
    void move();

    /*상속 vs 구현
    * 부모 클래스 기능 자식 클래스가 상속 받을 때,
    * 클래스 : 상속 받는다고 표현
    * 인터페이스 : 구현한다고 표현 (메서드 이름만 있는 설계도)
    *
    * -> 상속 : 부모의 기능을 물려받아 사용함
    * -> 인터페이스는 모든 메서드가 추상메서드이므로 물려받을 기능 없음
    *    즉, 인터페이스에 정의한 모든 메서드를 자식이 오버라이딩해서 기능을 만들어야 함 = 구현
    * 사람의 표현만 다를 뿐 자바에서는 똑같이 동작함*/
}
