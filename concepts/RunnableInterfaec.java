package concepts;

public class RunnableInterfaec implements Runnable{
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableInterfaec() );
        thread.start();

    }
}
