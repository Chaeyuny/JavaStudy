package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {

        Parent poly = new Child();


        //다운캐스팅(부모타입 -> 자식타입)
        Child child = (Child) poly;
        child.childMethod();

        //일시적 다운캐스팅 : 번거로운 다운캐스팅 과정 보완 / 변수 없이 다운캐스팅 가능
        ((Child) poly).childMethod();
        /*
         : 다운캐스팅이 우선되어야 하므로 괄호 처리
         *Parent 타입을 임시로 Child로 변경(변수 자체x 참조값 타입이 변함)
         * 메서드 호출 시 Child 타입에서 찾아 실행됨
         */
    }
}
