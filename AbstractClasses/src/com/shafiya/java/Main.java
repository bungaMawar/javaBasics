package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Red");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.eat();
        penguin.fly();
    }
}