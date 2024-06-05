package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();

        //자식 기능 호출x, 컴파일 오류 발생
        //poly.childMethod();


        //다운캐스팅(부모타입 -> 자식타입)
        Child child = (Child) poly;
        //부모를 자식타입으로 다운캐스팅 해서 자식 참조변수에 담음
        // : 캐스팅 이유는 부모타입 poly를 자식타입 child에 담을 수 없기 떄문

        /***캐스팅 한다고 poly 타입이 변하는 것은 아님
         * 여전히 부모타입이지만, 해당 변수에 담긴 참조값을 꺼내고
         * 이 참조값이 Child 타입이 되는 것.
         * 즉, poly는 여전히 Parent 타입이다***/

        child.childMethod(); //자식 메서드 호출 가능
    }
}
