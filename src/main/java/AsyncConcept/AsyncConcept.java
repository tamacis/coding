public class AsyncConcept {

  public static void main(String[] args) {
    
    AsyncFlow readFile = new AsyncTask();
     System.out.println(readFile.all());
    }
}

   abstract class  AsyncFlow {
   public int all() {  return 0; }
   final int map() { return 1;  }
   }

   interface AsyncChain {
   public AsyncFlow then(); 
   public AsyncFlow caught(); 
  }

   class AsyncTask extends AsyncFlow implements AsyncChain {
   public AsyncFlow caught () {
   return this;
   }
   public AsyncFlow then() {
   return this;
   }
}
