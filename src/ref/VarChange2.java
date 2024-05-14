package ref;

public class VarChange2 {
    //참조형에서의 대입 ( 중요 **)

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; //dataA에 들어있는 '참조값'을 dataB에 복사해서 대입

        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);

        //같은 주소를 가리키므로 들어있는 실제값도 동일
        System.out.println("dataA.value= " + dataA.value );
        System.out.println("dataB.value= " + dataB.value );


        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");

        /*dataA와 dataB는 같은 객체를 가리키며, 실제값은 하나만 존재한다.
          즉, 다른 방법(dataA, dataB)으로 같은 인스턴스에 접근하는 느낌이므로
          실제 value값은 동일하게 출력된다*/
        System.out.println("dataA.value= " + dataA.value );
        System.out.println("dataB.value= " + dataB.value );



        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");

        System.out.println("dataA.value= " + dataA.value );
        System.out.println("dataB.value= " + dataB.value );


    }
}
