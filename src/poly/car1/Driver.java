package poly.car1;

public class Driver {
    //역할과 구현 분리 적용

    //각 자동차 모델(구현)은 모름, Car 자동차(역할)만 아는 상태
    private Car car; //멤버변수

    //다형성 적용가능 : 모든 자동차 모델 타입은 Car에 담을 수 있음(인터페이스 구현)
    public void setCar(Car car){
        System.out.println("자동차를 설정합니다 : " + car);
        this.car = car;
    } //외부에서 누군가 해당 메서드를 호출해주어야 Driver는 새 자동차를 참조, 변경 가능

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    } //인터페이스가 제공하는 기능 통해 자동차 운전


    //운전하는 차 종류가 늘어도 Car를 사용하는
    // Driver 코드는 전혀 변경하지 않음 -> OCP 원칙
}
