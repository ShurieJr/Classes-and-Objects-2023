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
    //methods
    double getArea(){
        return radius * radius * Math.PI;
    }

}
