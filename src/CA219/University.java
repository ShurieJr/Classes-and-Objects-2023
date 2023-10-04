package CA219;

import java.sql.Statement;

public class University {
    //variables
    public String name ;
    static final int year = 2012;
    private String address;
    //constructors
    University(){
        this("JUST" , "Digfer");
//        name = "JUST";
//        address = "Digfer";
    }
    University(String name , String address){
        this.name = name;
        this.address = address;
    }
    //methods


    void printinfo(){
        int x=6;
        System.out.println(x);
        System.out.println(name);
        System.out.println(year); //static
        System.out.println(address);
    }
  
    static void pr(){
       // System.out.println(name); //instance
        System.out.println(year); //static
       // System.out.println(address); //instance
    }

    public static void main(String[] args) {
        University un = new University();
        System.out.println(un.address);
    }
}
