
public class interruptthread extends Thread{
    public void run(){
        System.out.println("entered run()");
        try{
            Thread.sleep(1000);
            System.out.println("out of sleep");
        }catch(Exception e){
            System.out.println("error e");
        }
        System.out.println("out of try...");
        
    }
    public static void main(String[] args){
        interruptthread obj1 = new interruptthread();
        obj1.start();
        obj1.interrupt();
    }
}