
public class RunnableAnonymus {
    public static void main(String... args) {

        Thread ct = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.activeCount());
                System.out.println("Thread running...");
            }
        });

        ct.start();
        while(ct.isAlive()) {
            System.out.print("=\b");
            System.out.print("|\b");
        }



    }
}