package Notifier.Decorator;

import Notifier.Notifier;
import Notifier.SMS;

public class SMSDecorator extends NotifierDecorator{
    public SMSDecorator(Notifier baseNotifier) {
        super(baseNotifier);
    }

    @Override
    public void send() {
        super.send();
        SMS sms = new SMS();
        sms.send();
    }
}
