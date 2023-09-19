package CA219;

public class Main {
    public static void main(String[] args) {
        //Object
        Circle myCircle = new Circle();
        System.out.println("Radius: " + myCircle.radius);
        System.out.println(myCircle.getArea());

        System.out.println("---------------");
        Circle myCircle2  = new Circle(5.0);
        System.out.println("Radius: " + myCircle2.radius);
        System.out.println( myCircle2.getArea());

        System.out.println("---------------");
        Circle myCircle3  = new Circle(10.5);
        System.out.println("Radius: " + myCircle3.radius);
        System.out.println( myCircle3.getArea());

    }
}