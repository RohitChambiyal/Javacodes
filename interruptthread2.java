public class interruptthread2 extends Thread{
    public void run(){
        for(int i=0;i<3;i++)
        {
            System.out.println(isInterrupted());
            System.out.println(isInterrupted());
            System.out.println(Thread.interrupted()); 
            System.out.println(isInterrupted());
            if(Thread.interrupted()){
                System.out.println("interrupt occur");
            }
            else
                System.err.println("done without interrupt");
                System.out.println(Thread.interrupted());
        }
    }
    public static void main(String[] args){
        interruptthread2 o = new interruptthread2();
        interruptthread2 o2 = new interruptthread2();
        o.start();
        o.interrupt();
        o2.start();
    }
}