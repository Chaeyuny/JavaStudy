package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        /*리팩토링 -- 기존 문제에 배열 도입해서 출력하기*/


        //배열 먼저 만들어놓고 풀기
        MovieReview[] movieReview = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        movieReview[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";
        movieReview[1] = aboutTime;

        for (MovieReview review : movieReview) {
            System.out.println("영화 제목 : " + review.title + ", 감상평 : " + review.review);
        }


    }
}
