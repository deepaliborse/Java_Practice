public class YT_Thread_Priority {
    public static void main(String[] args) {
        Thread_Priority tp1 = new Thread_Priority("Deepali");
        Thread_Priority tp3 = new Thread_Priority("Anushka - Least Important Thread!");
        Thread_Priority tp2 = new Thread_Priority("Harshi - Important Thread!");
        Thread_Priority tp4 = new Thread_Priority("Mukta");

        tp2.setPriority(Thread.MAX_PRIORITY);
        tp3.setPriority(Thread.MIN_PRIORITY);

        tp1.start();
        tp2.start();
        tp3.start();
        tp4.start();

    }
}


class Thread_Priority extends Thread{

    public Thread_Priority(String name){
        super(name);
    }


    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Thread Name: "+ this.getName());   //this operator here referees to thread class
            i++;
        }
    }
}