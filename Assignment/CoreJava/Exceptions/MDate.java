package CoreJava.Exceptions;
public class MDate {
    boolean invalid;
    
    public MDate(int day, int month, int year) throws DateException{
        invalid = false;
        if(month < 1 || month > 12){
            invalid = true;
        }
        else{
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                if(day < 1 || day > 31){
                    invalid = true;
                }
            }
            if(month == 4 || month == 6 || month == 9 || month == 11){
                if(day < 1 || day > 30 ) invalid = true;
            }
            if(month == 2 && (year % 4 == 0)){
                if(day < 1 || day > 29) invalid = true;
            }
        }
        if(invalid){
            throw new DateException("Invalid Date");
        }
    }
}