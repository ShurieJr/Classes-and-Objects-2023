package CA2110;

public class Lamp {
    boolean status;

    void turnOn(){
        status = true;
    }
    void turnOff(){
        status = false;
    }
    // Main method
    public static void main(String[] args) {
        //object
        Lamp lamp1 = new Lamp();
        System.out.println("Lamp status: " + lamp1.status);

       lamp1.turnOn();
        System.out.println("Lamp status: " + lamp1.status);

        lamp1.turnOff();
        System.out.println("Lamp status: " + lamp1.status);

    }
}
