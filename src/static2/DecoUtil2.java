package static2;

public class DecoUtil2 {

    /*단순히 기능만 제공하는 DecoUtil1 메서드에 static 붙임
      -> 정적 메서드가 됨
         : 정적 변수처럼 '인스턴스 생성 없이' 클래스 명을 통해 바로 호출 가능
    */

    public static String deco(String str){
        String result = "*" + str + "*";
        return result;
    }
}
