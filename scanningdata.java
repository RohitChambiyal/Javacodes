import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;

public class scanningdata {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("enter number");
        File f = new File("//media//rohit//The Castle//Java//Visual-Studio-Code//java//ScannerCodes//data.txt");
        Scanner in = new Scanner(f);
        //while(in.hasNext()){
        //System.out.println(in.nextLine() );
        //}
//findInLine(String pattern)
       // System.out.println("found its : " + in.findInLine("it"));
//findInLine(Pattern pattern)
       System.out.println("found its : " + in.findInLine(Pattern.compile(".hit")));
    }
}