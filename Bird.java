/*
Name: Joseph Grados
Class: ITEC 2150
Professor: Dr. Hyesung Park
Date: 10/1/2022
Purpose: A non-abstract class with the airplane class
 */
package Flight;

public class Bird {
    private String type;
    //no argument constructor

    public Bird(String type) {
        this.type = type;
    }
    //getters and setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String fly(){
        return(" I'm a bird who flaps wings to fly");
    }
    @Override
    public String toString(){
        return ("Bird [Type= " + type+ " ]:");
    }
}
