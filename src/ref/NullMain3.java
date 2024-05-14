package ref;

public class NullMain3 {

    public static void main(String[] args) {
        //2. 참조형 변수가 null 인 경우의 NullPointerException
        BigData bigData = new BigData();

        //멤버변수는 자동 초기화되므로 초기값 잘 출력됨
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        //NullPointerException 발생
        System.out.println("bigData.data.value" + bigData.data.value);
        //참조형 변수 data 초기값은 null이므로 찾아갈 주소 없어서 예외 발생 (bigData.null.value)
    }
}
