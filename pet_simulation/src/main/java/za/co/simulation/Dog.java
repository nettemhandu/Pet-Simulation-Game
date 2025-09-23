package za.co.simulation;

import java.io.FilenameFilter;
import java.lang.classfile.instruction.NewMultiArrayInstruction;

public class Dog extends Pet {

    public Dog(String name, int hunger, int happiness, int energy) {
        super(name, hunger, happiness, energy);
    }

    @Override
    public void feed() {
        String name = getName();
        System.out.println(name +" is eating...!");

        setHappiness(getHappiness() + 10);
        setHunger(getHunger() - 20);
    }

    @Override
    public void play() {
        String name = getName();
        System.out.println(name + " is playing fetch!");

        setEnergy(getEnergy() - 15);
        setHunger(getHunger() + 10);
        setHappiness(getHappiness() + 20);
    }

    @Override
    public void sleep() {
        String name = getName();
        System.out.println(name + " is sleeping...zzz");

        setEnergy(getEnergy() + 30);
        setHunger(getHunger() + 5);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }

    @Override
    public void showInfo() {
        String name = getName();

        System.out.println("Current info on " + name + ":");
        System.out.println(name + "'s energy is currently at: " + getEnergy());
        System.out.println(name + "'s happiness is currently at: " + getHappiness());
        System.out.println(name + "'s hunger is currently at: " + getHunger());
    }
}
