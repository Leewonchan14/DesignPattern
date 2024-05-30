package Notifier;

public class Slack implements Notifier{
    @Override
    public void send() {
        System.out.println("Slack Message!");
    }
}
