package log;

public class Logger implements Loggable{
    public Logger() {
    }

    @Override
    public void logMessage(String message) {
        System.out.println("LOG:" + message);
    }
}
