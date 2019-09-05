public class runt{
    public static void main(String[] args) throws Exception{
        int[] a = new int[50];
        Runtime r = Runtime.getRuntime();
        //Runtime.getRuntime().exec("notepad");
        System.out.println( Runtime.getRuntime().availableProcessors());
        System.out.println("initial memory details");
        System.out.println(r.freeMemory());
        System.out.println( r.totalMemory());
        for(int i : a){
            new runt();
        }
        for(int i=0;i<10000;i++){
            new runt();
        }
        System.out.println("after 10000 times initialising object");
        System.out.println(r.freeMemory());
        System.out.println( r.totalMemory());
        System.gc();
        System.out.println("after garbage collection");
        System.out.println(r.freeMemory());
        System.out.println( r.totalMemory());
    }
}