package CA218.P2;

import CA218.P1.C1;

public class C3 {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.x = 9; //public
        obj.m1(); //public
        obj.setZ(90);
        obj.getZ();
    }
}
