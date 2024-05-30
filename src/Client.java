import Notifier.Decorator.SMSDecorator;
import Notifier.Decorator.SlackDecorator;
import Notifier.FaceBook;
import Notifier.Notifier;

public class Client {
    public static void main(String[] args) {
        Notifier stack = new FaceBook();
        stack = new SMSDecorator(stack);
        stack = new SlackDecorator(stack);
        stack.send();
    }
}
