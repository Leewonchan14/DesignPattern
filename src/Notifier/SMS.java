package Notifier;

public class SMS implements Notifier{
    @Override
    public void send() {
        System.out.println("SMS message!");
    }
}
