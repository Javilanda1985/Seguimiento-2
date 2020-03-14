package Clases;

public class InvalidNotaException extends NumberFormatException {
    private String message;

    public InvalidNotaException(String message) {
        this.message = message;
    }


    @Override
    public String getMessage() {
        return this.getMessage();
    }

}
