package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        //멤버 변수만 존재하는 클래스로 간단한 코드 작성

        ValueData valueData = new ValueData();

        add(valueData);
        add(valueData);
        add(valueData);

        System.out.println("최종숫자 = "+valueData.value);
    }

    static void add(ValueData valueData){
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }

}
