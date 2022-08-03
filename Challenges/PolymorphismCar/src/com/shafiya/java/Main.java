package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).
        for(int i = 1; i < 11; i++){
            Car car = pickCar();
            System.out.println("Car #" + i + ": " + car.getName());
            System.out.println(car.startEngine());
        }

        Car car = new Car(5, "Mitsubushi");
        car.startEngine();
        car.accelerate(4);
        car.brake();
        System.out.println(car.getCurrentVelocity());

        Honda honda = new Honda();
        honda.startEngine();
        System.out.println(honda.accelerate(10));
        System.out.println(honda.getCurrentVelocity());
        System.out.println(honda.brake());

    }

    public static Car pickCar(){
        int randomNumber = (int) (Math.random() * 5);
        System.out.println("Random number: " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Honda();
            case 2:
                return new Chrysler();
            case 3:
                return new Toyota();
            default:
                return new CarNotFound();
        }
    }
}


class Car{
    private int cylinders;
    private String name;
    private int wheels = 4;
    private boolean engine = true;
    private int currentVelocity = 0;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine(){
        if(engine){
            return "Starting Car's engine";
        } else{
            return "Car's engine not found";
        }
    }

    public int accelerate(int velocity){
        System.out.println("Car is accelerating by " + velocity);
        currentVelocity = currentVelocity + velocity;
        return currentVelocity;
    }

    public String brake(){
        currentVelocity = 0;
        return "Car braked";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
}

class Honda extends Car{
    public Honda() {
        super(4, "Civic");
    }

    @Override
    public String startEngine(){
        if(super.getEngine()){
            return "Starting Honda engine";
        } else{
            return "Honda engine not found";
        }
    }

    @Override
    public int accelerate(int velocity){
        System.out.println("Honda is accelerating by " + velocity);
        return getCurrentVelocity() + velocity;
    }

    @Override
    public String brake(){
        return "Honda braked";
    }
}

class Chrysler extends Car{
    public Chrysler() {
        super(6, "Sebring");
    }

    @Override
    public String startEngine(){
        if(super.getEngine()){
            return "Starting Chrysler engine";
        } else{
            return "Chrysler engine not found";
        }
    }

    @Override
    public int accelerate(int velocity){
        System.out.println("Chrysler is accelerating by " + velocity);
        return getCurrentVelocity() + velocity;
    }

    @Override
    public String brake(){
        return "Chrysler braked";
    }
}

class Toyota extends Car{
    public Toyota() {
        super(6, "Sebring");
    }

    @Override
    public String startEngine(){
        if(super.getEngine()){
            return "Starting Toyota engine";
        } else{
            return "Toyota engine not found";
        }
    }

    @Override
    public int accelerate(int velocity){
        System.out.println("Toyota is accelerating by " + velocity);
        return getCurrentVelocity() + velocity;
    }

    @Override
    public String brake(){
        return "Toyota braked";
    }
}


class CarNotFound extends Car{
    public CarNotFound() {
        super(0, "Cannot find car.");
    }
}
