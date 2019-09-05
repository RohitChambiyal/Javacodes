class check implements Runnable{
    public void run(){
        try{
            Thread.sleep(2000);
            
        System.out.println("hellos");
        System.out.println(Thread.currentThread().getName());
        
        }catch(Exception e){
            System.out.println("hell yeah");
        }
    }
}
public class simple extends Thread{
    public void run(){
        
        try{
        Thread.sleep(2000);
        System.out.println("hello simple class is called");
        System.out.println(Thread.currentThread().getName());
        }catch(Exception e){
            System.out.println("error" +e);
        }
    }
    public static void main(String args[]){
        simple o2 = new simple();
        simple o3 = new simple();
        check o = new check();
        Thread t1 = new Thread(o);
        System.out.println(t1.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(o2.getPriority());
        o2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(o2.getPriority());
        System.out.println("ids");
        System.out.println(t1.getId());
        System.out.println(o3.getId());
        System.out.println(o2.getId());
        
        try{
            System.out.println("thread alive"+o2.isAlive());
            System.out.println("o2 before start");
            o2.start();
            o2.suspend();
             o2.checkAccess();
            System.out.println("is daemon "+ o2.isDaemon());
            System.out.println("o2 start");
            System.out.println("thread alive"+o2.isAlive());
            System.out.println("o3 before start");
            
          o3.start();  
          yield();
          System.out.println("o3 start");
          System.out.println("t3 before start");
          //t1.start();
          System.out.println("t1 start");
          System.out.println("thread alive"+o2.isAlive());
          System.out.println("t1 before run");
          t1.start();
          t1.interrupt(); 

          System.out.println("active threads"+ activeCount());
          System.out.println("thread interrupted" + t1.isInterrupted());
          
        
            System.out.println("t1 run");
            System.out.println("thread alive last"+o2.isAlive());
            System.out.println("before join");
        t1.join(3000);
        
        System.out.println("active threads"+ activeCount());
        System.out.println("t1 join");
        System.out.println("error "+getDefaultUncaughtExceptionHandler());
        System.out.println("get context classloader"+t1.getContextClassLoader());
        System.out.println( o2.toString());
        o2.stop();
        //o2.resume();

        
        
        }catch(Exception e ){
            System.out.println("error us "+ e);
        }
    }
}