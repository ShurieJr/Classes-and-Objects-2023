package CA2110;
public class Circle {
    //variables
    double radius;  //instance variable
    static int numberOfObjects;  //static variable
    //Constructors
    Circle(){
        radius = 1.0;
        numberOfObjects++;
    }
    Circle(double value){
        radius = value;
        numberOfObjects++;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    //methods
    double getArea(){
        return radius * radius * Math.PI;
    }

   static int getNumberOfObjects(){
        return numberOfObjects;
   }

    public static void main(String[] args) {
//        Circle c1 = new Circle();
////        c1.setRadius(5.0);
////        System.out.println(c1.getRadius());
////
////
////        System.out.println(Math.pow(2,3));
////        Circle.test();
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println(Circle.getNumberOfObjects() + " Object(s)");
        System.out.println(c1.getNumberOfObjects()+ " Object(s)");
        System.out.println(c2.getNumberOfObjects()+ " Object(s)");

        System.out.println("c1 radius: " + c1.getRadius());
        System.out.println("c2 radius: " + c2.getRadius());
        //System.out.println("c2 radius: " + Circle.getRadius());

    }

}
