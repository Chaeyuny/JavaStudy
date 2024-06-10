package poly.ex.sender;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new
                FaceBookSender()};

        //모든 방식으로 메세지를 보내므로 배열 이용 가능
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }

    }
}
