/*
Name: Joseph Grados
Class: ITEC 2150
Profesor: Dr. Hyesung Park
Date: 10/1/2022
Purpose: The make a superclass for the rest of the other exercises/classes.
 */
package FarmAnimals;
import java.util.Scanner;
public abstract class FarmAnimal {
    private String name;
    private String gender;
    private double weight;
    private int age;
    //no argument constructor
    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }
    //getters and setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //getters and setters for gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //getters and setters for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //getters and setters for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "[name=" + name + ", gender=" + gender +
                ", weight=" + weight + ", age=" + age + " ]";
    }
    public abstract String feedLoadingSchedule();

    public abstract String getSound();
}
