package static2;

import static2.DecoUtil1;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello java";

        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s); //글자 꾸미기 기능 사용

        System.out.println("before : " + s);
        System.out.println("after : " + deco);

    }
}
