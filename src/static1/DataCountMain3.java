package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        //count 정적 변수에 접근하는 방식이 조금 특이
        // :data1.count가 아닌 Data3.count --> 클래스에 직접 접근하는 것처럼 느껴짐

        Data3 data1 = new Data3("A"); //메서드 호출 -> 메서드 영역의 count 증가 코드 실행
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B"); //메서드 영역의 count 증가 2
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C"); //증가3
        System.out.println("C count = " + Data3.count);


        //추가
        //인스턴스를 통한 static 변수 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);
        /*data4 인스턴스가 있는 곳으로 가봄 -> count 있음 -> static임을 확인하고 메서드 영역에서 증가 코드 실행
        * 이러한 방식은 count가 인스턴스 변수인것처럼 보이게 할 수 있으므로
        * 권장되지 않음*/

        //클래스를 통한 접근
        System.out.println(Data3.count); //클래스에 직접 접근하므로 단번에 클래스 변수임을 인지할 수 있음
    }


}
