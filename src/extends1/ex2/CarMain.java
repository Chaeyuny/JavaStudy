package extends1.ex2;
public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); //Car에서 상속받은 기능 사용
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); //Car에서 상속받은 기능 사용
        gasCar.fillUp();

        /*자식 -> 부모 방향으로 상속 (자식은 부모를 알고있음)
        * 부모 내에는 자식에 대한 정의가 없으므로 반대로는 접근 불가
        * */

        /*단일 상속
        * 다중 상속 지원x 클래스 계층 구조가 복잡해질 수 있기 떄문.
        * 부모를 하나만 선택할 수 있음
        * 부모가 부모를 가지는 것은 가능*/


        /*** 상속과 메모리 구조 (중요)
         * 상속 관계의 객체를 생성하면 내부에는 부모, 자식이 모두 생성된다
         *  : x001 내에 Car, ElectricCar 모두 생성
         * 상속 관계의 객체 호출 시 대상 타입을 정해야 한다. -> 이 때 호출자의 타입을 통해 대상 타입을 찾는다
         *  : electricCar 변수의 타입인 ElectricCar 선택
         * 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아 실행한다. 부모로 올라가도 기능을 못찾으면 컴파일 오류 발생
         *  : electricCar에 move() 없으므로 상위 타입은 Car에서 move() 찾아 실행
         * ***/
    }
}
