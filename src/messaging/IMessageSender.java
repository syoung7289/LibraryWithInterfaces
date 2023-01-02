package messaging;

import libraryPatrons.IPerson;

public interface IMessageSender {
    void sendMessage(IPerson person, String message);
}
