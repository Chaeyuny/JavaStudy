package poly.ex1;

public class AnimalSoundMain {
    //다형성 적용 안한 코드

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw(); //ctrl + alt + v : 완성

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");


        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");

        //중복되는 코드를 제거해야 함. 단, 셋은 각각 다른 타입임을 고려해야 함
        /*타입이 서로 다르므로 메서드나 for문으로 중복 제거 불가
        다형적 참보, 메서드 오버라이딩 활용 시 모든 객체가 같은 타입을 사용하고,
        각자 자신의 메서드도 호출 가능함
         */
    }


}
