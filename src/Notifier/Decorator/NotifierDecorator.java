package Notifier.Decorator;

import Notifier.Notifier;

public class NotifierDecorator implements Notifier {
    private Notifier baseNotifier;

    public NotifierDecorator(Notifier baseNotifier) {
        this.baseNotifier = baseNotifier;
    }

    @Override
    public void send() {
        baseNotifier.send();
    }
}
