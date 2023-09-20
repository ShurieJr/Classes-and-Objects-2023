package CA219;
public class Student {
  String id ,  name , address , faculty;
  int age;
  boolean  active;

  //constructors
    Student (){
        id = "C112160";
        name = "Ali abdirahman";
        address = "waaberi";
        faculty= "Computer application";
        age= 23;
        active =true;
    }
    Student(String ID , String Name,String Address, String Faculty, int Age, boolean Active){
          id = ID;
          name = Name;
          address = Address;
          faculty = Faculty;
          age = Age;
          active = Active;
    }

    void printStudentDetails(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id );
        System.out.println("address : " + address );
        System.out.println("faculty : " + faculty );
        System.out.println("age : " + age );
        System.out.println("active : " + active );
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getId() {
        return id;
    }
    boolean getActive(){
        return active;
    }

    //main method
    public static void main(String[] args) {
        Student s1 =  new Student();
        s1.printStudentDetails();
        System.out.println("-------------------------------------");
        Student s2 = new Student("C112160" ,"Mohamed ali", "Hodan" , "BA" , 34 , true);
        s2.printStudentDetails();
    }
}
