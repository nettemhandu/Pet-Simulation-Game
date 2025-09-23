package za.co.simulation;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("blackie buns", 50, 50, 50);
        myDog.play();
        myDog.feed();
        myDog.sleep();
        myDog.makeSound();
        myDog.showInfo();

        Cat myCat = new Cat("Soma", 30, 30, 30);
        myCat.play();
        myCat.sleep();
        myCat.feed();
        myCat.makeSound();

        myCat.showInfo();
    }
}