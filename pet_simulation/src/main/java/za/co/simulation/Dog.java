package za.co.simulation;

import java.io.FilenameFilter;

public class Dog extends Pet {

    public Dog(String name, int hunger, int happiness, int energy) {
        super(name, hunger, happiness, energy);
    }

    @Override
    public void feed() {
        System.out.println("Dog is eating...!");

        setHappiness(getHappiness() + 10);
        setHunger(getHunger() - 20);
    }

    @Override
    public void play() {
        System.out.println("Dog is playing fetch!");

        setEnergy(getEnergy() - 15);
        setHunger(getHunger() + 10);
        setHappiness(getHappiness() + 20);
    }

    @Override
    public void sleep() {

    }

    @Override
    public void makeSound() {

    }


}
