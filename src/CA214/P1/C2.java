package CA214.P1;

public class C2 {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.x = 8; //public
        obj.y = 8; // default
        //obj.z=9; //private
        obj.setZ(8);
        obj.getZ();

        obj.m1();
        obj.m2();
    }
}
