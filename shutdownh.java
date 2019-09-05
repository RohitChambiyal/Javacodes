class threadmake extends Thread{
public void run(){
    System.out.println("Please don't go");
}
}

public class shutdownh{
    public static void main(String[] args){
        threadmake o = new threadmake();
        Thread t1 = new Thread(o);
        Runtime a = Runtime.getRuntime();
        a.addShutdownHook(t1);
        a.addShutdownHook(new Thread(){
           public void run(){
                System.out.println("anonymous thread");
            }
        });
        System.out.print("shutting down");
        try{
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);

        }catch(Exception e){System.out.println("error");};
    }
}