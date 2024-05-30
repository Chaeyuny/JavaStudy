package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

                //data2 객체 생성 시 초깃값 A, counter 객체 대입
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count= " + counter.count); //객체 생성되면서 count 멤버변수 1 증가됐으므로 1

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count= " + counter.count); // 2

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count= " + counter.count); //3

        /*Counter 인스턴스를 공통으로 사용해서
          객체를 생성할 때마다 값을 정확하게 증가시킬 수 있음
          하지만 실제로는 data2 객체의 수만 알고싶은 것인데, counter를 따로 생성해서
          공유하며 가져다 써야 하는 불편함이 존재함
          특정 클래스에서 (객체끼리)공용으로 함께 사용할 수 있는 변수가 있다면 편리할 것
          ---> static 변수
         */
    }
}
