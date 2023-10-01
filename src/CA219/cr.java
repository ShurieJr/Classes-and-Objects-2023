package CA219;

public class cr {
    private int radius;
    private static int y;

    cr(){
        this(1);
//        radius = 1;
    }
    cr(int radius){
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void setY(int y) {
        cr.y = y;
    }
}
