import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
public class scanner2{
    public static void main(String[] args){
        int [] a = {1,2};
        Scanner s = new Scanner(Arrays.toString(a));
        while(s.hasNext())
        System.out.println(s.next());
        System.out.println(Arrays.toString(a));
        System.out.println(s.useRadix(11));
       // s.useDelimiter("/");
        //System.out.println( s.tokens());
        //while(s.hasNext()){
         //   System.out.println(s.next());
        //}
      
      
        //Scanner s = new Scanner("hello \n hello 127 it is 20 0 102.3 hello and yes");
        
           // System.out.println(s.hasNextBigInteger(30));
//           s.skip("hello");
           //System.out.println( s.hasNext("hello"));
              //`  System.out.println("radix is "+s.radix());
                //System.out.println(s.match());
                //System.out.println(s.match().start());
  //              System.out.println(s.nextLine());
    //            System.out.println(s.nextLine());
              //  s.reset();
                
//            System.out.println(s.nextLine());
  //          System.out.println(s.locale());
    //        System.out.println(s.locale().getDisplayName());
        
       //findWithinHorizon(Pattern pattern):
        /*
       Scanner s = new Scanner(System.in);
       String s1 = s.findWithinHorizon(Pattern.compile("[a-z].*"), 8);
        System.out.println(s1); */
        
        //hasNextBigDecimal():
        /*
        Scanner s = new Scanner("hello 123 it is 1 0 and y");
        while (s.hasNext()){
            System.out.println(s.hasNextBigDecimal());
            System.out.println(s.next());
        } */

       
    }
}   