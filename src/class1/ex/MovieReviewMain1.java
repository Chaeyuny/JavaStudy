package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {

        /*MovieReviewMain 클래스 안에 main() 메서드를 포함하여
        * 영화 리뷰 정보를 선언하고 출력하기 */

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        System.out.println("영화 제목 : " + inception.title + ", 감상평 : " + inception.review);
        System.out.println("영화 제목 : " + aboutTime.title + ", 감상평 : " + aboutTime.review);



    }
}
