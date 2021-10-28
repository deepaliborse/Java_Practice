public class YT_Thread_Constructor {
    public static void main(String args[]){

        Thread_const t1 = new Thread_const("Deepali");  //Since we need to pass name to constructor
        Thread_const t2 = new Thread_const("Anushka");

        t1.start();
        System.out.println("\nThread ID: "+t1.getId() + "\nThread Name: "+t1.getName());

        t2.start();
        System.out.println("\nThread ID: "+t2.getId() + "\nThread Name: "+t2.getName());



        Runnable r1 = new Thread_runnable();
        Thread r = new Thread(r1, "Deepali");

        r.start();
        System.out.println("\nThread runnable ID: "+r.getId() + "\nThread runnable Name: "+r.getName());

    }
}


class Thread_const extends Thread{

    //Constructor of thread
    public Thread_const(String name){
        super(name);   //This name belongs to thread superclass
    }

    public void run(){
        System.out.println("Thread is running!\n");
    }
}


class Thread_runnable implements Runnable{
    public void run(){
        System.out.println("Inside Thread Runnable Interface!\n");
    }
}