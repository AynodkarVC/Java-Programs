package CoreJava.Collections;

public class ForEachDemo {
    public static void main(String[] args){
        String[] str = {"John","Luke","David"};
        for(String s: str){
            System.out.println(s);
        }
        int[] i = {1,2,3,4};
        for(int j: i){
           System.out.println(j);           
        }
    }    
}