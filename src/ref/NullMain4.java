package ref;

public class NullMain4 {

    public static void main(String[] args) {
        //NullMain3 해결
        BigData bigData = new BigData(); //bigData 객체 생성

        bigData.data = new Data(); // data 객체 생성 -> 참조값 부여
        // 생성한 data 객체의 참조값을 bigData의 멤버변수인 data에 대입

        System.out.println("bigData.coun t= " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        System.out.println("bigData.data.value = " + bigData.data.value);

    }
}
