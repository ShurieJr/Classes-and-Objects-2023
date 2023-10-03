package CA218;
public class University {
  static   String name; //static variable  //default
    private int year;
     String Address;

    University(){
        this("jimcaale university" , 2023 , "hodan");
//        name = "jamhuriya university";
//        Address = "Digfer";
//        year = 2012;
    }
    University (String name , int year , String address){
        this.name = name;
        this.year = year;
        Address = address;
    }

    public void setYear(int yr) {
        year = yr;
    }

    public int getYear() {
        return year;
    }
    void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + Address);
        System.out.println("year: " + year);
    }

    public static void main(String[] args) {

        University just = new University();
        System.out.println(name);

    }
}
