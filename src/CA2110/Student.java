package CA2110;
public class Student {
  String name , address , id;
  int age;
  Student(){
      name = "Mohamed ali";
      address = "waaberi";
      id="C112160";
      age = 23;
  }
     //accessor / mutator


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void printStudentInfo(){
      System.out.println("Name: " + name);
      System.out.println("id: " + id);
      System.out.println("address: " + address);
      System.out.println("age: " + age);
  }

  //main method
  public static void main(String[] args) {
      Student std = new Student();
      std.setName( "Omar ali");
      System.out.println(std.getName());
  }
}
