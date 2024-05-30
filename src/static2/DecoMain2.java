package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";

        //static 붙은 정적 메서드는 객체 생성 없이 클래스명.메서드명으로 바로 호출 가능
        String deco = DecoUtil2.deco(s);
        System.out.println("before : " + s);
        System.out.println("after : " + deco);


        /*메서드 종류
        * 클래스 메서드
          : = 정적 메서드/ static 붙은 메서드
          : 인스턴스 생성 없이 마치 클래스에 있는 메스드를 바로 호출하는 것처럼 보임
         * 인스턴스 메서드
          : static 붙지 않은 메서드. 인스턴스 생성해야 호출 가능
        */

    }
}
