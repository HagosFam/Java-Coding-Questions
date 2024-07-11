package concepts;

public class MultiThreading extends Thread{
    private String threadName;

    MultiThreading(String thread) {
        threadName = thread;
    }
    @Override
    public void run() {
       try {
           Thread.sleep(500);
       } catch (Exception e) {
           System.out.println(e);
       }

    }

    public static void main(String[] args) {
        MultiThreading thread1 = new MultiThreading("Thread 1");
        MultiThreading thread2 = new MultiThreading("Thread 2");
        MultiThreading thread3 = new MultiThreading("Thread 3");

        thread1.start();
    }

}
