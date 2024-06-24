package review_ex.pdf9_extends;

public class Book extends Item{
    private String author;
    private String isbn;

    //객체 하나 생성
    public Book(String name, int price, String author, String isbn) {
        super(name,price); //공통부분 객체
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print(); //부모 메서드 사용(공통출력)
        //제품마다 다른 부분
        System.out.println("- 저자:"+author + ", isbn:"+isbn);

    }

}
