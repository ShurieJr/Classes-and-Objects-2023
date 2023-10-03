package CA2110;
public class Main {
    public static void main(String[] args) {
      Circle myCircle = new Circle();
      printCircle(myCircle);

    }
   public static void printCircle(Circle obj){
        //1. access class variable
        System.out.println(obj.radius);
        // 2. call class methods
        System.out.println(obj.getArea());
    }
}
