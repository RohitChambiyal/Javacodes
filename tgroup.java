import java.lang.ThreadGroup;

class threadc implements Runnable{
    public void run(){
        System.out.println("thread called");
    }
}

public class tgroup{
    public static void main(String args[]){
        threadc tc1 = new threadc();
        ThreadGroup tg1 = new ThreadGroup("group1");

        Thread t1 = new Thread(tg1,tc1,"thread 1");
        Thread t2 = new Thread(tg1,tc1,"thread 1");
        Thread t3 = new Thread(tg1,tc1,"thread 1");
        t1.start();
        
        t2.start();
        
        t3.start();
        System.out.println(tg1.activeCount());
        tg1.list();
        System.out.println("parentof"+ tg1.parentOf(tg1));
        System.out.println("thread group name: "+tg1.toString());
        
    }

}