package CoreJava.IO;


public class IODemo1 {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        try{
            int i = System.in.read();
            char c = (char)i;
            System.out.println("Hi " + c);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
