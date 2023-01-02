package messaging;

import libraryPatrons.IPerson;

public class Emailer implements IMessageSender {
    @Override
    public void sendMessage(IPerson person, String message) {
        System.out.println(String.format("Simulating sending an email to %s", person.getEmail()));
        System.out.println(String.format("--> Message: %s", message));
    }
}
