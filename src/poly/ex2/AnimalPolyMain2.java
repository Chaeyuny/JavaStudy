package poly.ex2;

public class AnimalPolyMain2 {
    //다형성 + 배열, for문 적용

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        //Dog, Cat, Caw는 Animal 자식이므로 Animal 타입 배열에 담을 수 있음
        Animal[] animals = {dog, cat, caw};

        //동물이 추가되어도 변하지 않는 부분
        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");

        }

    }

}
