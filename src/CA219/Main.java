package CA219;

public class Main {
    public static void main(String[] args) {
        //WELCOME TO  JAVA. Classes and Objects...
        //Object
//        Circle myCircle = new Circle();
//        System.out.println("Radius: " + myCircle.radius);
//        System.out.println(myCircle.getArea());
//
//        System.out.println("---------------");
//        Circle myCircle2  = new Circle(5.0);
//        System.out.println("Radius: " + myCircle2.radius);
//        System.out.println( myCircle2.getArea());
//
//        System.out.println("---------------");
//        Circle myCircle3  = new Circle(10.5);
//        System.out.println("Radius: " + myCircle3.radius);
//        System.out.println( myCircle3.getArea());
        //primitive type
        int x =5;
        int y = 6;
        x = y;
        //object type
        Circle c1 = new Circle();
        Circle c2 =  new Circle(6.0);

        System.out.println("c1 radius: " + c1.radius);
        System.out.println("c2 radius: " + c2.radius);

        c1 = c2;
        System.out.println("After assigning c1 = c2 ");
        System.out.println("c1 radius: " + c1.radius);
        System.out.println("c2 radius: " + c2.radius);
    }
}