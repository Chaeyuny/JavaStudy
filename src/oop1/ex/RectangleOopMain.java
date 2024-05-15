package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 8;


        /*개선할 부분 : 처음에 출력문에서 호출함
          -> 프로그램 복잡할 경우 다시 사용할 수 있으니 변수에 담는다
          */

        int area = rectangle.calculateArea();
        System.out.println("넓이 : " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레길이 : " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부 : " + square);

        //객체지향은 대상이 살아있는 것처럼 객체에게 질문하는 것과 같음
    }
}
