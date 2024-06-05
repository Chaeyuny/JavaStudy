package poly.basic;

public class PolyMain {

    public static void main(String[] args) {

        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();
        //메모리상에 부모 생성(Parent 인스턴스)
        // -> 부모 메서드 호출 가능, 자식은 생성되지 않음


        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();

        //Parent 상속받았으므로 호출 가능 -> 메모리상에 부모, 자식 모두 생성됨
        child.parentMethod();
        child.childMethod(); //자신의 메서드 호출 가능


        //**다형적 참조**
        // : 부모 변수가 자식 인스턴스 참조
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

//        poly.childMethod();
      /*  : 타입이 Parent이므로 자신의 메서드만 호출 가능(자식 기능 호출x)
         : 호출자 변수의 타입(Parent)에 따라 Parent부터 기능 찾기 시작
             -> 상속관계는 부모 방향으로 찾아 올라갈 수 있지만 자식 방향으로 내려가지 못함
             -> Parent는 최상위 부모이므로 childMethod 찾기 불가능
      */

    }


    /*Parent poly = new Child();
      : 부모 타입의 변수가 자식 인스턴스 참조
     - Child 인스턴스가 생성되었으므로 메모리 상에 Child, Parent 모두 생성
     - 단, Parent 변수이므로 parentMethod()를 먼저 선택하게 됨
       (호출자인 Poly가 Parent 타입이므로 Parent 클래스부터 시작해서 필요한 기능 찾음)
     - 생성된 참조값을 Parent 타입 변수인 Poly에 담아둠.
    */
    /*** 부모 타입은 자식 타입을 담을 수 있다.***/
    /*  : 자식의 자식(손자, 하위타입)도 참조 가능
    *   : 부모 타입 자신 + 자신 기준 모든 자식타입 참조 가능
    *     --> 다형적 참조
    * */
    /*Parent poly = new Child(); (O)
     * Child child1 = new Parent(); (X) 자식은 부모타입 못담음*/



}
