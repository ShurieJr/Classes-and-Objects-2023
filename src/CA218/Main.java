package CA218;

public class Main {
    public static void main(String[] args) {
        University obj = new University();
        University obj2 = new University("jamhuriya" , 2012 , "Digfer");
//        obj = obj2;
      printUniversity(obj);
      sum( 2 , 7);

    }
    static void printUniversity( University u){ //refernce type
      u.printInfo();

    }
    static int sum(int x , int y){ // value type
    return  x+y;
    }
}
