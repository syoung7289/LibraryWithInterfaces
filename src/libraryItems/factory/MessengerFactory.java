package libraryItems.factory;

import messaging.Emailer;
import messaging.ILogger;
import messaging.IMessageSender;
import messaging.Logger;

public final class MessengerFactory {
    public static IMessageSender createMessageSender() {
        return new Emailer();
    }

    public static ILogger createLogger() {
        return new Logger();
    }
}
