package static2;

public class DecoUtil1 {

    //인스턴스가 필요한 것은 멤버변수 등을 사용하려는 목적이 큰데,
    // 이 메서드는 멤버변수 없이 단순히 기능만 제공함 -> 메인에서 객체 생성의 의미가 없음
    public String deco(String str){
        String result = "*" + str + "*";
        return result;
    }
}
