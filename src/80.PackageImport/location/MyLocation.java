package location; 
public class MyLocation extends City {
    public String whereILive() {
        return (cityName + ", " + countyName +", " + stateName + ", " + nationName);
    }
}