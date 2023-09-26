package CA2110;

public class test {
    int age;
    String name;
    boolean status;
    char gender;


    public static void main(String[] args) {
        test t1 = new test();
        test t2 = new test();
        t2.name = "ali";
        t1.name="mohmaed";
        t1 = t2;
        System.out.println(t1.name);

        //local variables
        int x =50;
        int y =80;
        x=y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
