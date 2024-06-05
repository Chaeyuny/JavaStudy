package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {
        //다운캐스팅을 자동으로 하지 않는 이유

        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); //다운캐스팅 -> 자식메서드 호출가능

        Parent parent2 = new Parent();
//        Child child2 = (Child) parent2; //런타임 오류 ClassCastException 발생.
//        child2.childMethod(); //실행 x

        /*parent2 생성 시 부모타입 객체 생성
        * 메모리상에 자식 타입(Child)은 존재하지 않음
        * 이 때, 사용할 수 없는 Child 타입으로 다운캐스팅 시도하면
          ClassCastException 예외 발생
          * 업캐스팅은 (자식) 객체 생성 시 해당 타입의 상위 부모 타입은 모두 함께 생성됨.
          * 즉, 위로만 타입을 변경하는 업캐스팅은 메모리 상에 인스턴스가 모두 존재하므로 항상 안전함
          * --> 캐스팅 생략가능
          * 다운캐스팅은 자식타입이 생성되지 않으므로 개발자가
            해당 문제를 인지하고 사용해야 한다는 의미로 명시적 캐스팅이 필요
        * */
    }
}
