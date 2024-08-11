package CoreJava.Exceptions;

public class DateException extends Exception{
    String message;
    
    public DateException(String message){
        this.message = message;
    }
    
    public String toString(){
        return message;
    }
}