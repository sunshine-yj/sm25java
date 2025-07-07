package bank;

public class NotEnoughbalanceException extends Exception {
    public NotEnoughbalanceException() {}
    public NotEnoughbalanceException(String message) {
        super(message);
    }
}
