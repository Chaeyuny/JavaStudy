package extends1.overriding;

public class ElectricCar extends Car {

    /*상속 메서드 오버라이딩
    *  : 메서드 이름은 같지만 새로운 기능 정의
    *  : 부모의 기능을 자식이 새로 재정의하는 것을 의미
    * */


    /*@Override
     * 프로그램이 읽을 수 있는 주석 = 어노테이션
     * 상위 클래스의 메서드를 오버라이드 하는 것임을 의미
     * 오버라이딩한 메서드 위에 기재해야 함
     * 생략 가능하지만 권장사함 : 메서드 이름 등을 잘못 쓰는 실수를 방지함*/

    @Override  //오버라이딩 어노테이션
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge(){
        System.out.println("충전합니다.");
    }
}
