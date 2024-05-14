package ref;

public class NullMain1 {
    public static void main(String[] args) {
        //null

        /*1. data 타입을 받을 수 있는 참조형 변수 data 선언
             단, null을 할당했으므로 data 변수에는 아직 가리키는 객체가 없다는 것을 의미함*/
        Data data = null;
        System.out.println("1. data = " + data);


        /*2. 새로운 객체 data를 생성하여 그 참조값을 data에 할당
             즉, data 변수가 참조할 객체가 존재한다는 것을 의미 */
        data = new Data(); //객체 생성
        System.out.println("2. data = " + data); //참조값


        /*3. data에 다시 null 할당 = 참조값 제거
             앞서 만든 data 인스턴스를 더는 참조하지 않게 됨 (다시는 참조할 수 없음)
         */
        data = null;
        System.out.println("3. data = " + data);

        /*해당 경우, data 인스턴스를 아무도 참조하지 않게 되므로 메모리 용량만 차지하게 됨
        * 자바는 이러한 인스턴스가 있을 경우 JVM 의 GC(가비지 컬렉터)가
        * 더 이상 사용하지 않는 인스턴스로 판단하고 자동으로 메로리에서 제거해준다
        *
        * -> 인스턴스를 참조하는 곳이 있으면 JVM 종료 시까지 계속 생존하지만 참조하는 곳이 없으면 GC를 통해 제거한다*/
    }


}
