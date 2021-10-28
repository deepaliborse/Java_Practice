public class YT_Thread_SleepMethod {
    public static void main(String[] args) {
        ThreadSleepMethod1 t1 = new ThreadSleepMethod1();
        ThreadSleepMethod2 t2 = new ThreadSleepMethod2();

        System.out.println("t1 state: "+t1.getState());

        t1.start();
        t2.start();

        // state of t1
        System.out.println("t1 state: "+t1.getState()+"\n");

        // Current running thread name
        System.out.println("currently running thread: "+Thread.currentThread().getName()+"\n");

        // State of currently running thread
        System.out.println("State of currently running thread: "+Thread.currentThread().getState()+"\n");
    }
}


class ThreadSleepMethod1 extends Thread{
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println(i+ ". Inside Thread Method 1!\n");

            try{
                Thread.sleep(8);
            }
            catch(Exception e){
                System.out.println(e);
            }

            i++;
        }
    }
}



class ThreadSleepMethod2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println(i+ ". ---- Inside Thread Method 2!\n");

            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                System.out.println(e);
            }

            i++;
        }
    }
}