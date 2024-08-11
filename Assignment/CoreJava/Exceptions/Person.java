package CoreJava.Exceptions;

public class Person {
    String name;
    MDate date;
    public Person(String name, int day, int month, int year) throws DateException{
        this.name = name;
        date = new MDate(day,month,year);
    }
}