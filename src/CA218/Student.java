package CA218;
public class Student {
    //variables
    String name , ID, Faculty;
    int age;
    boolean status;
    //constructors
   Student (){
       name = "Mohamed abdullahi";
       ID = "C112160";
       Faculty = "CA";
       status = true;
       age= 24;
    }
    Student(String Name , String id , String faculty,int Age, boolean Status){
       name = Name;
       ID = id;
       Faculty = faculty;
       status = Status;
       age= Age;
    }
    //methods
    void setName(String value){
       name = value;
    }
    void setID(String id){
       ID = id;
    }
    void printDetails(){
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Faculty: " + Faculty);
        System.out.println("Status: " + status);
    }

}
