package Notifier;

public class FaceBook implements Notifier{
    @Override
    public void send() {
        System.out.println("FaceBook Message!");
    }
}
