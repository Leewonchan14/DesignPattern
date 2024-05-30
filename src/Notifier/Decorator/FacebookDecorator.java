package Notifier.Decorator;

import Notifier.Notifier;
import Notifier.FaceBook;

public class FacebookDecorator extends NotifierDecorator {
    public FacebookDecorator(Notifier baseNotifier) {
        super(baseNotifier);
    }

    @Override
    public void send() {
        super.send();
        FaceBook faceBook = new FaceBook();
        faceBook.send();
    }
}
