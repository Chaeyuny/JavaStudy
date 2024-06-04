package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this.value = "  + this.value) ; //this 생략 가능
        System.out.println("super.value = " + super.value) ; //super : 부모 클래스 의미

        this.hello();  // 내것이므로 this 생략가능
        super.hello(); //부모클래스에서 찾음
    }
}
