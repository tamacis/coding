
class ExceptionStack {
    public static void main(String args[]) {
        System.out.println("Building up the stack:");
        StackTraceElement ste[] = Thread.currentThread().getStackTrace();
        for (StackTraceElement temp : ste) { System.out.println(temp.getMethodName()); }

        new One().invokeAnother();

        System.out.println("\nBack to main:");
        ste = Thread.currentThread().getStackTrace();
        for (StackTraceElement temp : ste) { System.out.println(temp.getMethodName()); }  
    }
}

class One {
    void invokeAnother() {
        System.out.println("\nNow the stack is:");     
        StackTraceElement ste[] = Thread.currentThread().getStackTrace();
        for (StackTraceElement temp : ste) { System.out.println(temp.getMethodName()); }    
	
        new Two().invokeOneMore();

        System.out.println("\nRemoved invokeOneMore:");      
        ste = Thread.currentThread().getStackTrace();
        for (StackTraceElement temp : ste) { System.out.println(temp.getMethodName()); }  
    }    
}

class Two {
    void invokeOneMore() {
        System.out.println("\nPutting more on the stack:");
        StackTraceElement ste[] = Thread.currentThread().getStackTrace();
        for (StackTraceElement temp : ste) { System.out.println(temp.getMethodName()); }    
    }  
}

