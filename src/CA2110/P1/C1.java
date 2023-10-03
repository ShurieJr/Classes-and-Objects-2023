package CA2110.P1;
public class C1 {
  public int x;
   int y;
  private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void m1(){

  }
  void m2(){

  }

  private void m3(){

  }

    public static void main(String[] args) {
        C1 c = new C1();
        c.setZ(100);
        System.out.println(c.getZ());
    }
}
