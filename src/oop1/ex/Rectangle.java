package oop1.ex;

public class Rectangle {
    //절차 지향 프로그램을 객체 지향 프로그램으로 변경하기

    //속성
    int width;
    int height;

    //기능

    //넓이 구하기
    int calculateArea(){
        return width*height;
    }

    //둘레 길이 구하기
    int calculatePerimeter(){
        return 2*(width*height);
    }

    //정사각형 여부 구하기
    boolean isSquare(){
        return width == height;
    }
}

