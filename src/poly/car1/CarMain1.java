package poly.car1;

public class CarMain1 {
    //역할과 구현 분리 적용
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량 변경(k3 -> model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car); //기존 인스턴스에서 새 참조값으로 교체
        driver.drive();

        //차량 변경(model3 -> newCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();

        /*OCP 원칙 - 코드 수정은 닫혀있다는 의미
        * : 새 차 추가시 기능이 추가되므로 기존 코드 수정이 불가피함.
        *   변하는 부분과 변하지 않는 부분으로 구분함
        *
        * 변하지 않는 부분 : Driver
        *  : 새 차 추가시 가장 영향을 받는 클라이언트.
        *  : Car 인터페이스를 사용하는 클라이언트인 Driver 코드는 수정하지 않아도 됨
        *
        * 변하는 부분 : Main 등
        *  : 새 차를 생성하고 Driver에게 필요한 차를 전달하는 역할은 코드 수정이 발생함
        *  : main()은 전체 프로그램 설정 및 조율의 역할을 하므로 OCP를 지켜도 변경이 필요*/
    }
}
