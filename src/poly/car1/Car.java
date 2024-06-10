package poly.car1;

public interface Car {
    //역할과 구현 분리 적용

    void startEngine();
    void offEngine();
    void pressAccelerator();

    /*OCP 원칙 - 확장에 열려있다는 의미
     : Car 인터페이스를 사용해 새 차량 자유롭게 추가가능
     : Car 인터페이스를 사용하는 클라이언트 코드인 Driver도
       새로 추가된 차량을 자유롭게 호출 가능*/
}
