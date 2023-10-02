package CA218;
public class Circle {
        //variables
       private double radius; //instance variable
      private  static int numberOfObjects;  // static variable
    //constructors
    Circle(){
        this(1.0);
//        radius = 1.0;
//        numberOfObjects++;
    }
    Circle(double value){
        radius  = value;
        numberOfObjects++;
    }
    //methods
    double getArea(){
        return radius * radius * Math.PI;
    } //instance method

    //static method
    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
       Circle.numberOfObjects = numberOfObjects;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println(c2.radius);


    }
}
