public class deadlocks{
    public static void main(String[] args){
         final String var1 = "INDIA";
         final String var2 = "IS GREAT";
         Thread t1 = new Thread(){
             public void run(){
                synchronized(var1){
                    System.out.println("thread 1 var 1 :"+var1);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){System.out.println(e);}
                    synchronized(var2){
                        System.out.println("thread 1 var 2 :"+var2);
                    }
                }
             }
         };

         Thread t2 = new Thread(){
            public void run(){
               synchronized(var2){
                   System.out.println("thread 2 var 2: "+var2);
                   try{
                       Thread.sleep(500);
                   }catch(Exception e){System.out.println(e);}
                   synchronized(var1){
                       System.out.println("thread 2: var 1" + var1);
                   }
               }
            }
        };
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
         
    }
}