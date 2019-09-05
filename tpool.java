import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
    private String message1;
    public WorkerThread(String s){
        this.message1 = s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" thread start() message = "+ message1);
        sleeping();
        System.out.println(Thread.currentThread().getName()+" Thread stops");
    }
    public void sleeping(){
        try{
            System.out.println("thread sleeping");
            Thread.sleep(200);
            System.out.println("thread came out of sleep");
        }catch(Exception e){
            System.out.println("error caught = "+e);
        }
    }
}
public class tpool{
    public static void main(String [] args){
        //int k=0;
    ExecutorService es1 = Executors.newFixedThreadPool(5); // creating pool of 5 threads here
    for(int i=0;i<10;i++){
        Runnable worker = new WorkerThread("Thread Object = "+i);
        es1.execute(worker);    //execute method of ExecutorService called.

    }
    es1.shutdown();
    while(!es1.isTerminated()){

        //System.out.println("terminating.... "+k);
        //k++;
    }
    System.out.println("Executed all threads.");
    System.out.println("great....");
    }
}