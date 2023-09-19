package CA219;

public class Circle {
    double radius;  //VARIABLE
    //constructor
    Circle(){   //NO argument constructor
      radius = 1.0;
    }
    Circle(double newRadius){ // parametrized constructor
       radius = newRadius;
    }


    //methods
    double getArea(){
        return radius * radius * Math.PI;
    }

}
