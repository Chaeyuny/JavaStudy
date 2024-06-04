package extends1.ex;

public class Album extends Item {
    private String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print(){ //ctrl + o : 오버라이드 할 메서드 선택
        super.print();
        System.out.println(" - 아티스트:"+this.artist);
    }
}
