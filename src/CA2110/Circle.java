package CA2110;
public class Circle {
    //variables
    double radius;
    //Constructors
    Circle(){
        radius = 1.0;
    }
    Circle(double value){
        radius = value;
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

    static void test(){
        System.out.println("static method for testing!");
    }


    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5.0);
        System.out.println(c1.getRadius());


        System.out.println(Math.pow(2,3));
        Circle.test();



    }

}
