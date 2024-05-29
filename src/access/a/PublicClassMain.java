package access.a;

public class PublicClassMain {
    //패키지 동일, 다른 클래스에서 접근 가능
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();

    }
}
