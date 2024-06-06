package poly.diamond;

//인터페이스는 다중구현 가능
public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    //InterfaceA, InterfaceB에 모두 있는 메서드
    // : 같은 메서드이므로 하나만 구현하면 됨 (기능 상속받은 것이 아니므로)
    //  -> 다중상속 가능한 이유 ( 클래스는 기능을 상속받으므로 다중상속 시 다이아몬드 문제 발생 )
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }


}
