/*
Name: Joseph Grados
Class: ITEC 2150
Professor: Dr. Hyesung Park
Date: 10/1/2022
Purpose: A subclasses from the farm animal class
 */
package FarmAnimals;

public class Duck extends FarmAnimal{
    private String sound;

    public Duck(String name, String gender, double weight, int age, String sound) {
        //From the farmanimal class
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    @Override
    public String toString(){
        return (super.toString() + "\n" + "Sound: " + sound);
    }

    public String feedLoadingSchedule() {
        return("8am-12pm-6pm");
    }
}
