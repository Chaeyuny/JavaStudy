package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {

        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); //변수는 parent (변수는 오버라이딩 x)
        poly.method(); //Parent 타입인데 메서드는 Child.method 출력됨 (메서드는 오버라이딩O)
        /**오버라이딩 된 메서든느 항상 우선권을 가진다.
         *  + 더 하위 자식의 오버라이딩 된 메서드가 우선권 가짐***/

        /*poly 변수는 Parent 타입.
        * 즉, 변수와 메서드 호출 시 Parent 타입에서 기능을 찾아 실행함
        * poly.value : Parent 타입에 있는 value 값 읽음
        * poly.method() : Parent 타입에 있는 method()를 실행하려 함.
                          근데 하위타입인 Child.method()가 오버라이딩 되어 있음
                          * 오버라이딩 된 메서드는 항상 우선권을 가짐 *
                          * 즉, Parent.method()가 아니라 오버라이딩된 Child.method()가 실행됨*/

    }
}
