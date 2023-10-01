package CA219.P2;

import CA219.Circle;
import CA219.P1.C1;

public class C3 {
    public static void main(String[] args) {
        C1 obj = new C1();
        printInfo(obj);
    }
    public static void printInfo(C1 just){
        System.out.println(just.x);
        just.setZ(10);
        System.out.println(just.getZ());
    }
}
