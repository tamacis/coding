
import java.util.Random;

class ImportantStudy {
    public static void main(String args[]) {
        // only three people answered my craigslist ad: Bob, Mary and Larry.
        // They each put in a hard day at the office with the following results:  

        Bob.BobsDay(); // yes! we can directly call a static method from a static method
    
        //Larry.LarrysDay(); // no! we cannot directly call a non-static method from a static method
        new Larry().LarrysDay(); // call by reference on non-static method
    
        new Mary().MarysDay();
    
        System.out.println("Drumroll ... and our results are: ");
        System.out.println("Heads total: " + RunningTotal.heads);
        System.out.println("Tails total: " + new RunningTotal().tails);
        System.out.println("I\'m calling it close enough for government work, let\'s grab a bite to eat. ");
    }
}

class Bob {
	static void BobsDay() {
		Skills.workHard(300_000); // static method directly called from static method
	}
}

class Larry {
	void LarrysDay() {
		Skills.workHard(350_000); // static method directly called from a non-static method
	}
}

class Mary extends Skills {
	void MarysDay() {
		workHard(350_000); // static method directly called from a non-static method using inheritance
	}
}

class Skills {

	static int flipCoin() {
		Random randomNumber = new Random();
		return randomNumber.nextInt(2); // the 2 argument will set the return range of either a 0 or 1.
	}

	static void workHard(int numberOfFlips) {
		for (int i = 0; i < numberOfFlips; i++ ) {
			if (flipCoin() == 0)
				RunningTotal.heads++;
			else
				RunningTotal.tails++;
		}	
	}
}

class RunningTotal {
    static int heads = 0;
    static int tails = 0;	
}