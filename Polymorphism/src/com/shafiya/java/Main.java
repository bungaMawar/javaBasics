package com.shafiya.java;

class Movie{
    private String name;
    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }
    public String getName(){
        return this.name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A murder shark";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }
    @Override
    public String plot(){
        return "Alien invasion";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Kids running a maze";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }
    @Override
    public String plot(){
        return "Farmer boy turned space wizard saves the galaxy";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable");
    }
}
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n");

        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5);
        System.out.println("Random number: " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            default:
                return new Forgettable();
        }
    }
}