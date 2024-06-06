package poly.ex2;

public class AnimalPolyMain1 {
    //다형성 적용

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

    }

    //Animal은 Dog, Cat, Caw의 부모이므로 매개변수에 담을 수 있음(다형적 참조)
    // : 오버라이딩 된 메서드가 우선이므로 오버라이딩한 각 동물의 울음소리가 호출됨
    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //동물이 추가되어도 Animal을 상속받는다면 기능 그대로 이용 가능
}
