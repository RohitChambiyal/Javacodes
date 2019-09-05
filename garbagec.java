public class garbagec{
    public void finalize(){
        System.out.println("finalze called");
    }
    public static void main(String[] args){
        garbagec a = new garbagec();
        garbagec b = new garbagec();
        a=b;
        System.gc();    
    }
}