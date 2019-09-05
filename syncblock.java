//class for printing
class s2{
     static public void printing(int a){
         
         synchronized(s2.class){
             try{System.out.println("sync called" + a);
                 Thread.sleep(500);
                 System.out.println("sync called" + a);
             }catch(Exception e){
                 System.out.println("error");
             }
         }
        for(int i=1;i<=5;i++){
            
            System.out.println(i*a);
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println("error" + e);}
        }
    }
}
//class for thread1
class  thread11 extends Thread{
    s2 a;
    thread11(s2 a){
        this.a = a;
    }
    public void run(){
        s2.printing(1);
    }
}
class  thread21 extends Thread{
    s2 a;
    thread21(s2 a){
        this.a = a;
    }
    public void run(){
        s2.printing(10);
    }
}


public class syncblock{
    public static void main(String[] args){
        s2 o = new s2();
        s2 o2 = new s2();
        thread11 to1 = new thread11(o);
        thread21 to2 = new thread21(o2);
        Thread t1 = new Thread(to1);
        Thread t3 = new Thread(to2);
        Thread t2 = new Thread(){
            public void run(){
                s2.printing(100);
            }
        };
        t1.start();
        t3.start();
        t2.start();
    }
}