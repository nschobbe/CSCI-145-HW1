package src.java.main.Exceptions;

public class InvalidPlayerTypeException extends Exception {
    
    private static final long serialVersionUID = 1L;

    public InvalidPlayerTypeException(String message) {
        super(message);
    }
}