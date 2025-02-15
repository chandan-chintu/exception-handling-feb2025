package customexceptions;

public class UserErrorException extends Exception{

    public UserErrorException() {
    }

    public UserErrorException(String message) {
        super(message);
    }
}
