package CA218.P1;

public class C2 {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.x = 6; //public
        obj.y = 8; //default
        obj.setZ(9);
        obj.getZ();

        obj.m1();
        obj.m2();
    }
}
