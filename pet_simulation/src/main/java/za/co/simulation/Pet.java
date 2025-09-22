package za.co.simulation;

public abstract class Pet {
    // Attributes of the abstract class
    private String name;
    private int hunger;
    private int happiness;
    private int energy;

    // Constructor to initialize attributes
    public Pet(String name, int hunger, int happiness, int energy) {
        this.name = name;
        this.hunger = hunger;
        this.happiness = happiness;
        this.energy = energy;
    }

    // Abstract method (must be implemented by concrete subclasses)
    public abstract void feed();
    public abstract void play();
    public abstract void sleep();
    public abstract void makeSound();

    // Getters for private attributes

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getEnergy() {
        return energy;
    }
}
