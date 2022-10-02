/*
Name: Joseph Grados
Class: ITEC 2150
Professor: Dr. Hyesung Park
Date: 10/1/2022
Purpose: The airplane class that is one of two non-abstract class
 */

package Flight;

public class Airplane {
    private String model;
    private int year;
    //no argument constructor
    public Airplane(String model, int year) {
        this.model = model;
        this.year = year;
    }
    //getters and setters for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    //getters and setters for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String fly(){
        return(" I'm on an airplane that relies on an engine to fly");
    }
    @Override
    public String toString(){
        return ("Airplane [model= " + model + ", year = " + year + " ]:");
    }
}
