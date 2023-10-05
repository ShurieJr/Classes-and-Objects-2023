package CA214;

public class Orders {
    private  int orderNO;
    private double price;
    static int items = 3;

    Orders(){
    this(01 , 9);
    }
    Orders(int orderNO , double price){
        this.orderNO = orderNO;
        this.price = price;
        if (items >=1 ){
            items--;
        }
        else{
            System.out.println("Sorry! the stock is Empty!");
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static int getItems() {
        return items;
    }
    public void printOrderInfo(){
        System.out.println("Order NO: " + orderNO);
        System.out.println("Price: " + price);
        System.out.println("Items : " + items);
        System.out.println("--------------------");
    }


    public static void main(String[] args) {
        Orders order1 = new Orders();

        Orders order2 = new Orders(2 , 4.5);

        Orders order3 = new Orders(3 , 9);

        Orders order4 = new Orders();

    }
}
