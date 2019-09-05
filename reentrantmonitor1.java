
public class reentrantmonitor1{
public synchronized  void yes(){
    System.out.println("yes called");
    no();
}
public synchronized  void no(){
    System.out.println("no called");
    try{Thread.sleep(5000);}catch(Exception e){ System.out.println("error");}
}
    public static void main(String[] args){
        reentrantmonitor1 obej1 = new reentrantmonitor1();
        reentrantmonitor1 obej2 = new reentrantmonitor1();
        obej1.yes();
        obej2.yes();
    }
}