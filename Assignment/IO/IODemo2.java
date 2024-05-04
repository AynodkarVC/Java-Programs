package IO;

public class IODemo2 {
    public static void main(String[] args) {
        System.out.println("Keep Trying");
        System.out.println("q to Quit");
        while (true){
            try{
                char c = (char)System.in.read();
                System.out.print(c);
                if (c == 'q'){
                    break;
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
