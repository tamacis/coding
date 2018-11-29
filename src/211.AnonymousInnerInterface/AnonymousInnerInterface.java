
//public interface Runnable {
//    public abstract void run();
//}

class Tester {
    public static void main(String args[]){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running ...");
            }
        };
        new Thread(r).start();
    }
}

class Tester2 {
    public static void main(String args[]){
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(i < Integer.MAX_VALUE) { System.out.println("Strange, but cool syntax ... "+ i++); }
            }
        }).start();
    }
}