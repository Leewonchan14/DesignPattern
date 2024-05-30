package Notifier.Decorator;

import Notifier.Notifier;
import Notifier.Slack;

public class SlackDecorator extends NotifierDecorator {

    public SlackDecorator(Notifier baseNotifier) {
        super(baseNotifier);
    }

    @Override
    public void send() {
        super.send();
        Slack slack = new Slack();
        slack.send();
    }
}
