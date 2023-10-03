package CA2110;
public class th {
    int radius;
    static  int noOfObjects;
    th(){
        this(1);
//        radius = 1;
//        noOfObjects++;
    }
    th(int radius){
        this.radius = radius;
        noOfObjects++;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void setNoOfObjects(int noOfObjects) {
        th.noOfObjects = noOfObjects;
    }

    public static void main(String[] args) {
        th obj = new th();
        System.out.println(obj.radius);
    }
}
