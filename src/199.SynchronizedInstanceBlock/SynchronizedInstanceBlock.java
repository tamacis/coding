import java.util.*;
class SynchronizedInstanceBlock {
    public static void main(String args[]) {
        InstanceList iL = new InstanceList();
        for (int i = 0; i < 100; i++) {
            new NumberThread(iL, i);
        }
        System.out.println("Active threads: "+Thread.activeCount());
        iL.displayList();
    }
}

class InstanceList {      
    private ArrayList<Integer> numberList = new ArrayList<>();

    void addToList(Integer number) {
        numberList.add(number);  // ArrayList add() method in addToList is not thread-safe - problems
    }
    void displayList() {
        System.out.println(numberList);
    }  
}

class NumberThread implements Runnable {
    private int number = 0;
    private InstanceList refToIL = null;

    NumberThread(InstanceList refToIL, int number){
        this.refToIL = refToIL;
        this.number = number;
        new Thread(this).start();
    }

    @Override
    public void run() { // this is where the new thread starts
        refToIL.addToList(number);
    }
}
