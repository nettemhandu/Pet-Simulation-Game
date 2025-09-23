package za.co.simulation;

public class Cat extends Pet {

    public Cat(String name, int hunger, int happiness, int energy) {
        super(name, hunger, happiness, energy);
    }

    @Override
    public void feed() {
        String name = getName();
        System.out.println(name +" is eating...");

        setHappiness(getHappiness() + 5);
        setHunger(getHunger() - 15);

    }

    @Override
    public void play() {
        String name = getName();
        System.out.println(name + " is chasing a mouse...");

        setEnergy(getEnergy() - 5);
        setHunger(getHunger() + 5);
        setHappiness(getHappiness() + 10);
    }

    @Override
    public void sleep() {
        String name = getName();
        System.out.println(name + " is sleeping...zzz");

        setEnergy(getEnergy() + 20);
        setHunger(getHunger() + 5);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow!");
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
