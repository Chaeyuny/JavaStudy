package review_ex.pdf12_poly;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("sms를 발송합니다:" + message);
    }
}
