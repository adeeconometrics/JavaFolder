package Exceptions;

public class userDefinedException extends Exception{
    @Override
    public String getMessage() {
        return "interval should be from 0-100 only.";
    }
}
