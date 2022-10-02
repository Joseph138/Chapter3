/*
Name: Joseph Grados
Class: ITEC 2150
Professor: Dr. Hyesung Park
Date: 10/1/2022
Purpose: A subclasses from the farm animal class
 */
package FarmAnimals;

public class Cow extends FarmAnimal{
    private String sound;
    //no-arg constructor
    public Cow(String name, String gender, double weight, int age, String sound) {
        //From the farmanimmal class
        super(name, gender, weight, age);
        this.sound = sound;
    }
    //Getters and setters for sound
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String feedLoadingSchedule(){
        return "6am-4pm";
    }
    @Override
    public String toString() {
        return ("Cow " + sound + " " + super.toString());
    }
}
