package CA219.P1;

public class C2 {
    public static void main(String[] args) {
        C1 obj = new C1();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.setZ(9);
        System.out.println(obj.getZ());
        obj.m1();
        obj.m2();
    }
}
