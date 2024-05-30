package static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        //의도는 객체 생성될때마다 count 되는 것.
        //하지만 객체를 생성할 떄마다 data1 인스턴스는 새로 만들어짐
        // 즉, count 변수도 새로 만들어지므로 count 값은 계속 1
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data1.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data1.count);
    }


}
