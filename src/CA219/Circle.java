package CA219;

public class Circle {
    double radius;  // instance VARIABLE
   static int numberOfObjects;  // Static variable
   static final int NUMBER = 10; //Static constant

    //constructor
    Circle(){   //NO argument constructor
      radius = 1.0;
      numberOfObjects++;
    }
    Circle(double newRadius){ // parametrized constructor
       radius = newRadius;
       numberOfObjects++;
    }


    //methods
    //Instance method
    double getArea(){
        numberOfObjects++;
        getNumberOfObjects();
        return radius * radius * Math.PI;
    }

    //Static method
    static int getNumberOfObjects(){
        int a = NUMBER;
        return numberOfObjects;
    }


    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(5);

        System.out.println("number of objects : " +Circle.numberOfObjects);
        System.out.println("radius(c1): " + c1.radius);
        System.out.println("radius(c2): " + c2.radius);
        System.out.println("radius(c3): " + c3.radius);

        System.out.println(Circle.NUMBER);

    }

}
