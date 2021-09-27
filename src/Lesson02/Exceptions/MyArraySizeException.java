package Exceptions;

public class MyArraySizeException extends Exception{

    public MyArraySizeException(String msg, int length) {
        super(msg);
    }
}
