public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private String coat;
    private int teeth;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, String coat, int teeth) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
        this.teeth = teeth;
    }

    private void chew(){
        System.out.println("Dog chews");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat called");
        chew();
        super.eat();
    }
}
