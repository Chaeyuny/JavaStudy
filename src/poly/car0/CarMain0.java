package poly.car0;

public class CarMain0 {
    //다형성 없는 코드
    public static void main(String[] args) {
        Driver driver = new Driver(); //운전자 생성
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); //처음 차 참조값 빼기
        driver.setModel3Car(model3Car); //새로 추가된 차 셋팅
        driver.drive();

        //또 새로운 차량을 추가해야 한다면 변경해야 하는 코드가 많아짐
        // : 자동차가 늘어날 뿐인데 운전자 코드가 계속 변경되어야 함
        // : 역할과 구현을 분리하지 않았기 떄문
    }
}
