package poly.ex4;
public abstract class AbstractAnimal {
    //순수 추상 클래스
    // : 클래스 내 모든 메서드가 추상 메서드인 클래스
    // : 코드를 실행할 바디부분이 전혀 없음
    public abstract void sound();
    public abstract void move(); //move도 추상메서드로 선언했으므로 오버라이딩 해야함

    /***순수추상클래스 특징***/
    /*
    * 1. 인스턴스 생성 불가
    * 2. 상속 시 자식은 모든 메서드를 오버라이딩 해야 함
    * 3. 주로 다형성을 위해 사용됨
    *
    * 추상클래스는 마치 어떤 규격을 지켜서 구현해야 하는 것처럼 느껴짐
    * -> AbstractAnimal의 경우 sound(), move()라는 규격에 맞춰 구현해야 함
    * => 순수 추상 클래스를 더 편리하게 사용하기 위해 '인터페이스' 개념 제공
    */
}
