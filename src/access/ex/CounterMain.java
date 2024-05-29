package access.ex;

public class CounterMain {

    public static void main(String[] args) {
        //주어진 메인 코드
        MaxCounter counter = new MaxCounter(3);

        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();

        System.out.println(count);
    }
}
