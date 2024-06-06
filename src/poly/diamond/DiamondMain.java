package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        //메모리에 InterfaceA, Child 모두 생성됨
        InterfaceA a = new Child();

        a.methodA();
        a.methodCommon();

        //a 타입인 InterfaceA부터 접근
        // -> 오버라이딩 된 메서드 있으므로
        // -> Child 인스턴스의 오버라이딩된 메서드 실행

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();   //b를 통해 본 methodCommon도 Child에 오버라이딩 되어있으므로 이를 실행
    }
}
