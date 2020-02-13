package src.java.main.Exceptions;

public class InvalidMonsterTypeException extends Exception {
    
    private static final long serialVersionUID = 1L;

    public InvalidMonsterTypeException(String message) {
        super(message);
    }
}