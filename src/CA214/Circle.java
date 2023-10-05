package CA214;
public class Circle {
    //variables
    double radius; //instance variable
    final int NUMBER = 9;
   static int numberOfObjects; //static variable
    //constructors
    Circle(){
        this(1.0 );
//       radius = 1.0;
//        numberOfObjects++;

    }
    Circle(double value ){
        radius = value;
        numberOfObjects++;
    }

    //methods
    double getArea(){ //instance method
        return radius * radius * Math.PI;
    }

    //static method
   static int getNumberOfObjects(){
        return numberOfObjects;
    }

    void test(){
        System.out.println(numberOfObjects);
        getNumberOfObjects();
        getArea();
        System.out.println( radius);
    }
    static void test2(){
        System.out.println(numberOfObjects);
        getNumberOfObjects();
//        getArea();
//        System.out.println( radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(6);
        System.out.println(Circle.numberOfObjects);
        System.out.println(c1.numberOfObjects);
        System.out.println(c2.numberOfObjects);
    }
}
