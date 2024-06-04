package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    /*public : 모두 접근 가능
    * protected : 동일 패키지, 다른 패키지 상속관계 접근
    * default : 동일 패키지만 접근
    * private : 같은 클래스 내에서만 접근*/

    public void call(){
        publicValue = 1;
        protectedValue = 1; //자식, 부모는 다른 패키지지만 상속관계라 접근 가능
//        defaultValue = 1; //다른 패키지 접근 불가, 컴파일 오류
//        privateValue = 1; //접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); //상속관계 or 같은패키지
//        defaultMethod();
//        privateMethod();

        printParent();
    }


}
