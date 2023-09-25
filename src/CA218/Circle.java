package CA218;
public class Circle {
        //variables
        double radius; //instance variable
    //constructors
    Circle(){
        radius = 1.0;
    }
    Circle(double value){
        radius  = value;
    }
    //methods
    double getArea(){
        return radius * radius * Math.PI;
    } //instance method


   static void printinfo(){ //static method
        System.out.println("Static method!");
    }

    public static void main(String[] args) {


    }
}
