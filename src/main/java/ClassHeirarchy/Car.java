
public class Car {
    
    //attributes
    public String brand;
    public String model;
    public double cost;
    public int chasisNumber;

    //default constructor
    public Car(){
        brand = " ";
        model = " ";
        cost = 0.0;
        chasisNumber = 0;
    }
    
    //setter and getter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getChasisNumber() {
        return chasisNumber;
    }

    public void setChasisNumber(int chasisNumber) {
        this.chasisNumber = chasisNumber;
    }
    
    //constructor
    public Car(String model,double cost,String brand){
        this.model=model;
        this.cost=cost;
        this.brand=brand;
    }
    
    //main
    public static void main(String[] args) {
        //object1
        Car c1= new Car("Mustang",36.56,"Toshiba");
        System.out.println("Model= "+c1.getModel());
        System.out.println("Cost= "+c1.getCost());
        System.out.println("Brand= "+c1.getBrand());
        
        //object2
        Car c2=new Car("BMW",25.69,"Nissan");
        System.out.println("Model = "+c2.getModel());
        System.out.println("Cost = "+c2.getCost());
        System.out.println("Brand = "+c2.getBrand());
    }//main ends
}//class ends
