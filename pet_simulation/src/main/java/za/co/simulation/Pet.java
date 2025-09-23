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
    public abstract void showInfo();

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

    public void setHunger(int hunger) {
        if (hunger < 0) {
            this.hunger = 0;
        } else if (hunger > 100) {
            this.hunger = 100;
        } else {
            this.hunger = hunger;
        }
    }

    public void setHappiness(int happiness) {
        if (happiness < 0) {
            this.happiness = 0;
        } else if (happiness > 100) {
            this.happiness = 100;
        } else {
            this.happiness = happiness;
        }
    }

    public void setEnergy(int energy) {
        if (energy < 0) {
            this.energy = 0;
        } else if (energy > 100) {
            this.energy = 100;
        } else {
            this.energy = energy;
        }
    }
}
