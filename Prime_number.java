/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime_number;

/**
 *
 * @author Ric
 */
public class Prime_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(" the number you want to check is");
        for(int x=2;x<25;x++)
        {
        boolean y = true;
        if (x==1)
        {
        y=false;
        }
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
            {
                y=false;
                break;
            }
            
        }
       
        
    if(y==true)
    {
     System.out.println("prime" + x);
     
    }
    else
    {
        System.out.println("not prime" + x);
}
        }}}