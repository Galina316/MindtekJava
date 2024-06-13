package homework1.exception;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message){
        super(message);
    }
}
