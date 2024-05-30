package static1;

public class Data2 {
    public String name;

    //data2 객체를 생성할 때마다 counter 인스턴스의 count 변수 1 증가
    public Data2(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }
}
