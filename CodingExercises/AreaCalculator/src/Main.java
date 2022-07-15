public class Main {
    public static void main(String[] args) {
        System.out.println("Radius: 5, Area: " + area(5));
        System.out.println("X: 3, Y: 5, Area: " + area(3, 5));
    }

    public static double area(double radius){
        if(radius < 0){
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }
        return x * y;
    }
}