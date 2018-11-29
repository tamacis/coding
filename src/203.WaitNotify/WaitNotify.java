
class WaitNotify {
    public static void main(String args[]) {
        CleanHair clean = new CleanHair(); // single object
        new HairThread("Lather", clean);
        new HairThread("Rinse", clean);
    }
}

class CleanHair {
    String currentState=""; // object state
	
    synchronized void Lather() {
        currentState = "Lather";
        System.out.println(currentState);
        notify();
        try {
            wait();
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        }
    }

    synchronized void Rinse() {
        currentState = "Rinse";
        System.out.println(currentState);
        notify();
        try {
            wait();
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        }	
    }

}

class HairThread extends Thread {
    String name;
    CleanHair cleanRef;
		
    HairThread(String name, CleanHair cleanRef) {
        this.name = name;
        this.cleanRef = cleanRef;
        setName(name);
        start();
    }
	
    @Override
    public void run() {
        if (name.equals("Lather")) {
            cleanRef.Lather(); 
        }
        if (name.equals("Rinse")) {
            cleanRef.Rinse(); 
        }
    }
}

