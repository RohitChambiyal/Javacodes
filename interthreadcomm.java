class banking{
    int amount;
    banking(int amount){

        this.amount = amount;
        System.out.println("Initial Amount : "+ this.amount);
    }
    synchronized public void withdraw(int amount){
        System.out.println("Entering Withdraw.");
        if(this.amount<amount){
            System.out.println("Account balance less. waiting for deposit....");
            try{
                wait();
            }catch(Exception e){
                System.out.println("error : "+ e);
            }
        }
        this.amount -=amount;
        System.out.println("Withdrawn Successfully");
        System.out.println("Deducted amount : "+amount);
        System.out.println("Current balance : "+this.amount);
    }
    synchronized public void deposit(int amount){
        System.out.println("Entering Deposit.");
        this.amount +=amount;
        System.out.println("Deposited amount : "+amount);
        System.out.println("Current balance : "+this.amount);
        notify();
    }
}

public class interthreadcomm{
    public static void main(String[] args){
    banking b1 = new banking(100);
    new Thread(){
        public void run(){
            b1.withdraw(110);

        }
    }.start();
    new Thread(){
        public void run(){
            b1.deposit(30);

        }
    }.start();
    Thread t = new Thread(){
        public void run(){
            System.err.println("finally everything done");
        }
    };
    Runtime r = Runtime.getRuntime();
    r.addShutdownHook(t);

    
    }
}