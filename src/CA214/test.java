package CA214;

public class test {
    private  int age;
    private static String name;

    test(int age , String name){
        this.age = age;
        this.name = name;
    }

    public static void setName(String name) {
        test.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        test obj = new test(23 , "Mohamed");
        System.out.println(obj.age);
        System.out.println(test.name);
    }
}
