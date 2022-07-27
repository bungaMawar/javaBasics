public class Fish extends Animal{
    private int fins;
    private int gills;
    private int eyes;


    public Fish(int size, int weight, String name, int fins, int gills, int eyes) {
        super(1, 1, size, weight, name);
        this.fins = fins;
        this.gills = gills;
        this.eyes = eyes;
    }

    public void rest(){

    }
    public void swim(int speed){
        moveMuscles();
        moveBackFin();
    }

    public void moveMuscles(){

    }
    public void moveBackFin(){

    }
}

