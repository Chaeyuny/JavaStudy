package access.a;

public class AccessData {
    public int publicField;
    int defaultField; //package-private
    private int privateField;

    public void publicMethod(){
        System.out.println("publicMethod 호출" + publicField);
    }

    public void defaultMethod(){
        System.out.println("defaultMethod 호출" + defaultField);
    }

    public void privateMethod(){
        System.out.println("privateMethod 호출" + privateField);
    }

    public void innerAccess(){

        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();

        //내부호출 : 자기 자신에게 접근 --> 전부 접근 가능
    }

}
