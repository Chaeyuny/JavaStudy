package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        super(); //부모가 기본 생성자만 가질 경우 생략 가능
        System.out.println("ClassB 생성자 a=" +a);
    }

    public ClassB(int a, int b){
        super();
        System.out.println("ClassB 생성자 a = " + a + " b = " + b);
    }

    /*상속 관계를 사용하면 자식 클래스의 생성자에서
    * 부모 클래스의 생성자를 반드시 호출해야 한다.
    * super()
      : ClassB는 ClassA를 상속받음
      * 상속을 받으면 '생성자의 첫줄'에 super()를 사용하여 부모 클래스 생성자 호출
      * 부모 클래스 생성자가 기본 생성자인 경우 super()생략 가능*/


    //여러개의 생성자가 있을 때,
    // super 대신 this로 자신의 생성자를 첫줄에 호출하더라도,
    // 마지막에는 반드시 super를 호출해야 한다.
}
