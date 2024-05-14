package ref;

public class VarChange1 {
    public static void main(String[] args) {
        //자바 대원칙 : 변수의 대입은 변수에 들어있는 '값'을 '복사'해서 대입한다.
        int a = 10;
        int b = a; // a 자체를 b에 대입하는 것이 아니라, a의 값인 10을 복사해서 대입하는 것

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        //즉, a 또는 b 값을 변경해도 서로 영향을 주지는 않는다.

        //a 변경
        /*a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        */

        //b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
