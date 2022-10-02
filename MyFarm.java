/*
Name: Joseph Grados
Class: ITEC 2150
Professor: Dr. Hyesung Park
Date: 10/1/2022
Purpose: Creating a main class to print out the results
 */
package FarmAnimals;

import java.util.ArrayList;

public class MyFarm {
    public static void main(String[] args) {
        ArrayList<FarmAnimal> animals = new ArrayList<>();

        animals.add(new Duck("Donald","female",3.2,5,"Quack Quack"));
        animals.add(new Duck("Cheese","female",3.6,5,"Quack Quack"));
        animals.add(new Cow("Molly","female",1600.0,3,"Moo Moo"));
        animals.add(new Chicken("Albert", "male",1.6,2,"Cock-a-Doodle-do"));
        animals.add(new Chicken("Amelia","female",1.8,4,"Cluck Cluck"));
        animals.add(new Chicken("Dixie","female",1.7,4,"Cluck Cluck"));

        for(FarmAnimal animal : animals)
            System.out.println(animal.toString());

        for(FarmAnimal animal : animals)
            System.out.println(animal.getName() + ": " + animal.feedLoadingSchedule());
    }
}
