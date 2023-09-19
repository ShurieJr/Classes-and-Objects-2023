package CA218;

public class MobilePhone {
    String name;
    double price;

    MobilePhone(){
        name = "NOKIA";
        price = 100;
    }
    MobilePhone(String Name , double Price){
        name = Name;
        price = Price;
    }

    void printDetails(){
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
    }
}
