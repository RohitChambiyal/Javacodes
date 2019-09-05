import java.util.Scanner;
import java.util.regex.Pattern;


public class scanner3{
    public static void main(String[] args){
        Scanner s = new Scanner("hello 12hles 432fsd 23jkl jlkj23 32lkjkl23 jkl23klj");
        while(s.hasNext("hel.......")){
            System.out.println(s.next());
        }
        
        System.out.println("end");
    
    
    
    }
}