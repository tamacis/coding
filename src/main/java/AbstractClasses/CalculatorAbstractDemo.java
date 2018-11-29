package AbstractClasses;

interface Basic {
    int sum();
    int diff();
}

interface Scientific {
    double sin();
    double exp();
}

// RealCalc implements both interfaces
abstract class RealCalc implements Basic, Scientific {}

// We have to @Override both interfaces from RealCalc
public class CalculatorAbstractDemo extends RealCalc {
    @Override  
    public int sum() {return 0;}
    
    @Override 
    public int diff() {return 0;}
   
    @Override  
    public double sin() {return 0;}
    
    @Override 
    public double exp () {return 0;}
       
}