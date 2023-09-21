package CA214;

public class Person {
    String name , address , Id;
    int age;
    Person(){
        name = "ali";
        address= "waaberi";
        Id = "C112160";
        age = 24;
    }

    void printPersonInfo(){
        System.out.println("Name: " + name);
        System.out.println("id: " + Id);
        System.out.println("address: " + address);
        System.out.println("age: " + age);
    }

    //main method
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Mohamed ali";
        p1.age= 56;

        p1.printPersonInfo();
    }
}
