package CA214;
public class Circle {
    //variables
    double radius;
    //constructors
    Circle(){
        radius = 1.0;
    }
    Circle(double value){
        radius = value;
    }

    //methods
    double getArea(){
        return radius * radius * Math.PI;
    }
    static void test(){
        System.out.println("static method!");
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();

        System.out.println(c1.getArea());
        Circle.test();
    }
}
