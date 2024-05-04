package IO;

public class IODemo3 {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        byte[] b = new byte[50];
        try{
            int i = System.in.read(b);
            String str = new String(b,0,i-2);
            System.out.println("Hi " + str);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
