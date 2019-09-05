//class for printing
class s1{
    synchronized static public void printing(int a){
        for(int i=1;i<=5;i++){
            System.out.println(i*a);
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println("error" + e);}
        }
    }
}
//class for thread1
class  thread1 extends Thread{
    s1 a;
    thread1(s1 a){
        this.a = a;
    }
    public void run(){
        s1.printing(1);
    }
}
class  thread2 extends Thread{
    s1 a;
    thread2(s1 a){
        this.a = a;
    }
    public void run(){
        s1.printing(100);
    }
}


public class sync1{
    public static void main(String[] args){
        s1 o = new s1();
        s1 o2 = new s1();
        thread1 to1 = new thread1(o);
        thread2 to2 = new thread2(o2);
        Thread t1 = new Thread(to1);
        Thread t2 = new Thread(){
            public void run(){
                s1.printing(10);
            }
        };
        Thread t3 = new Thread(to2);
        
        t1.start();
        
        t2.start();
        t3.start();
    }
}