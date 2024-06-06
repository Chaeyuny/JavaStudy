package poly.ex2;

public class AnimalPolyMain3 {
    //다형성 + 배열, for문 적용2

    public static void main(String[] args) {

        //객체 생성하면서 배열에 담기 가능
        // ctrl + alt + n : 변수 선언된 부분 제거하고 합치는 단축키
        Animal[] animals = {new Dog(), new Cat(), new Caw()};


        for (Animal animal : animals) {
            soundAnimal(animal);
            //메서드로 만들 부분 블럭 씌우고 ctrl + alt + m 하면 자동생성

        }

    }


    //동물이 추가되어도 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


    /*남은 문제
    * 1. Animal 클래스를 생성할 수 있는 문제
       -> 실제 존재하는 인스턴스가 아니므로 생성할 일이 없어야함
    * 2. Animal 클래스를 상속 받는 곳(Dog, Cat 등)에서
    *    sound() 메서드를 오버라이딩 하지 않을 가능성
    *  -> 빠트려도 부모 메서드의 sound() 찾아가므로 코드상으로는 문제x
    *
    * => 추상 클래스와 추상 메서드 사용하면 해결 가능(ex3)*/
}
