class SuperSub {
    public static void main(String args[]) {
        City oCity = new City();        
        oCity.cityName = "Orlando";
        oCity.countyName = "Orange County";    
        oCity.stateName = "Florida";
        oCity.nationName = "USA";
        System.out.println("I live in " + oCity.cityName + ", " + oCity.countyName + ", " + oCity.stateName + ", " + oCity.nationName);

        County oCounty = new County();
        oCounty.countyName = "Norfolk County";
        oCounty.nationName = "England";
        //oCounty.cityName = "Hemsby"; // error - County is the superclass of City. Superclasses do not have access to subclass members.
        System.out.println(oCounty.countyName + ", " + oCounty.nationName + ", is a wonderful place to visit.");

        
    }
}

class Nation extends Object { // superclass of State, subclass of Object
    String nationName = "";
}

class State extends Nation { // superclass of County, subclass of Nation
    String stateName = "";
}

class County extends State { // superclass of City, subclass of State
    String countyName = "";
}

class City extends County { // subclass of County
    String cityName = "";
}
