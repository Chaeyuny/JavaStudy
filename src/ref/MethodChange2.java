package ref;

public class MethodChange2 {

    //참조형과 메서드 호출
    public static void main(String[] args) {
        Data dataA = new Data(); //data 인스턴스 생성 후 참조값을 dataA 변수에 담음
        dataA.value = 10;        //value에 숫자 10을 할당한 상태
        System.out.println("메서드 호출 전 :  " + dataA.value);

        //1. 메서드 호출 -> 값 전달
        changeReference(dataA);
        System.out.println("메서드 호출 후 :  " + dataA.value);

    }

    /*2. int dataX = dataA 로 해석할 수 있음
         변수 dataA는 참조값을 가지고 있으므로 참조값을 복사해서 전달
      -> 즉, dataA와 dataX는 둘 다 같은 참조값을 가지게 됨. dataX를 통해서도 참조값에 있는 data 인스턴스에 접근 가능해짐
    */
    static void changeReference(Data dataX){
        dataX.value = 20; //data 인스턴스 값 변경
    }


    /* 기본형과 참조형의 메서드 호출 정리
      - 자바에서 메서드의 파라미터(매개변수)는 항상 값에 의해 전달됨. 단 이 값이 실제값인지 참조값(메모리주소)인지에 따라 동작이 달라짐
       1) 기본형
          : 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달.
          : 메서드 내부에서 파라미터 값을 변경해도 호출자의 변수 값에는 영향이 없다.
       2) 참조형
          : 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다.
          : 메서드 내부에서 파라미터로 전달된 객체의 '멤버변수'를 변경하면,
            호출자의 객체도 같은 메모리 주소를 가리키므로 호출자의 객체도 변경된다.
     */
}
