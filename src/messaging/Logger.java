package messaging;

public class Logger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println(String.format("Write to console: %s", message));
    }
}
