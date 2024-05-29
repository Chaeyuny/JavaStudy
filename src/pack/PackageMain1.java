package pack;

public class PackageMain1 {
    public static void main(String[] args) {

        //사용자와 같은 위치 : 동일 패키지
        Data data = new Data();  // 경로 생략 가능

        //사용자와 다른 위치 : PackageMain과 User는 서로 다른 패키지
        pack.a.User user = new pack.a.User(); // 패키지 전체 경로 기입


        //항상 전체 경로를 입력하기 불편 --> import 사용하는 이유
    }
}
