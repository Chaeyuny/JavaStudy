package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {

        /*절차지향 프로그래밍 2
          : 1번 코드에 클래스(MusicPlayerData) 도입하기
        */

        /*음악 플레이어와 관련된 데이터 묶기
         : 클래스 멤버변수를 활용하면 추후 다른 변수들이 추가되더라도
          음악 플레이어 관련 데이터를 구분하기 쉽다
         */
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이터 켜기
        data.isOn = true;
        System.out.println("음악 플레이를 시작합니다.");

        //볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : "+data.volume);
        //볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : "+data.volume);
        //볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : "+data.volume);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");

        if (data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨 : "+ data.volume);
        } else{
            System.out.println("음악 플레이어 OFF");
        }

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}
