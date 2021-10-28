public class YT_Thread_JoinMethod {
    public static void main(String[] args) {
        ThreadMethod1 t1 = new ThreadMethod1();
        ThreadMethod2 t2 = new ThreadMethod2();

        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}


class ThreadMethod1 extends Thread{
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Inside Thread Method 1!\n");
            i++;
        }
    }
}



class ThreadMethod2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("---- Inside Thread Method 2!\n");
            i++;
        }
    }
}