package CA218;
public class Car {
    String model, manufacture, color;
    double price;

    Car() {
        model = "BRADO";
        manufacture = "TOYOTA";
        color = "black";
        price = 5000;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    void printCarInfo() {
        System.out.println(model);
        System.out.println(price);
        System.out.println(manufacture);
        System.out.println(color);
    }

    //main method
    public static void main(String[] args) {
        Car Brado = new Car();
        System.out.println(Brado.getPrice());
    }
}


