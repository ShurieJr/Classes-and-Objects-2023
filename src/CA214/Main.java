package CA214;
public class Main {
    public static void main(String[] args) {
//        //object  --- Circle
////        Circle myCircle = new Circle();
////        myCircle.radius = 5;
////        System.out.println("Radius: " + myCircle.radius);
////        System.out.println("Area: " + myCircle.getArea());
////        System.out.println("----------------------------------");
////
////        Circle yourCircle = new Circle(10);
////        System.out.println("Radius: " + yourCircle.radius);
////        System.out.println("AREA: " + yourCircle.getArea());
//        Person p1 = new Person();
//        p1.name = "Mohamed ali";
//        p1.age= 56;
//
//       p1.printPersonInfo();
//local varaiables
        Circle obj1 = new Circle();
        Circle obj2 = new Circle(5);
        printCircle(obj1);
        printCircle(obj2);
    }

  public  static void printCircle(Circle obj){
        System.out.println(obj.radius);
    }
}
