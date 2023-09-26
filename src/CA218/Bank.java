package CA218;

public class Bank {
    int AccountNumber;
    String AccName;
    double balance;
    Bank(){
        AccName = "Mohamed abdullahi";
        AccountNumber = 1010;
        balance = 0;
    }
    void deposit(double value){
        balance += value;
        System.out.println(value +  " aa dhigatay!");
    }
    void withdraw(double value){
        if (value <= balance){
            balance -= value;
            System.out.println(value + " aa labaxday!");
        }
        else{
            System.out.println("haraagaagu kuguma filna!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Bank myBank =  new Bank();
        System.out.println("balance: " + myBank.getBalance());
        myBank.deposit(500);
        System.out.println("balance after deposit: " + myBank.getBalance());
        myBank.withdraw(200);
        System.out.println("balance after withdraw: " + myBank.getBalance());
    }
}
