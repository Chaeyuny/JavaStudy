package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
        //인터페이스(추상) 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();


        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();


        soundAnimal(cat); //오버라이딩 된 sound 출력
        soundAnimal(dog);
        soundAnimal(caw);

        moveAnimal(cat); //오버라이딩 된 move 출력
        moveAnimal(dog);
        moveAnimal(caw);
    }


    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

}
