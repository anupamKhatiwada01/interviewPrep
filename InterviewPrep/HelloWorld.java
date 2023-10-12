/* Online Java Compiler and Editor */

class MultithreadingTest implements Runnable{
    
    Thread t;
    String threadName;
    
    MultithreadingTest(String name){
        System.out.println("The threadName is: "+name);
        this.threadName = name;
    }
    
    
    public void run(){
        try{
            // System.out.println("Thread "+Thread.currentThread().getId()+" is running.");
            System.out.println("this: ");
            System.out.println("-----------------------------------------------------------");
            System.out.println(this.t);
            System.out.println("-----------------------------------------------------------");
            System.out.println(Thread.currentThread());
            System.out.println(Thread.currentThread().isDaemon());
            System.out.println("-----------------------------------------------------------");

            



        }catch (Exception e){
            System.out.println("Exception has occured and is caught.");
        }
    }
    
    
    public void startingRunnable(){
        if(this.t==null){
            System.out.println("We are inside start for: "+this.threadName);
            // this.t=new Thread(new MultithreadingTest(this.threadName));
            // Below constructor for thread takes Runnable object and name of thread
            this.t=new Thread(this,this.threadName);
            this.t.start();
            // System.out.println("New thread created: -----------------------");

        }       
    }
    
    
}

public class HelloWorld{

     public static void main(String []args){
        // System.out.println("Hello, World!");
        
        int n=6; // These are the number of threads
        // This is how multiple threads are created and run at the same time
        
        for(int i=0;i<n;i++){
            // Thread obj = new Thread(new MultithreadingTest());
            // obj.start();
            try{
                String t = "thread_"+i;
                System.out.println(t);

                MultithreadingTest m = new MultithreadingTest(t);
                m.startingRunnable();
                // m.run();
                
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }

        System.out.println(Thread.currentThread().toString());




     }
}


