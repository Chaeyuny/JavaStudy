package extends1.ex1;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        /*전기차, 가솔린차는 자동차의 구체적인 개념
        * 그래서 둘은 '이동(move)' 기능이 공통됨
        * 주유 방식만 다를 뿐 이동하는 것은 동일
        * -> 상속 관계 이용하는 것이 효과적*/
    }
}
