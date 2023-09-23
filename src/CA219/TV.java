package CA219;
public class TV {
    int channel , volume;
    boolean status;

    TV(){
        channel = 1;
        volume  =1;
        status = false;
    }

    void  turnOn(){
        status =  true;
    }
    void turnOff(){
        status = false;
    }

    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
    void volumeUp(){
        volume++;
    }
    void volumeDown(){
        volume--;
    }

    public void setChannel(int value) {
        channel = value;
    }

    //main method
    public static void main(String[] args) {
        TV STV = new TV();
        System.out.println(STV.status);
        STV.turnOn();
        System.out.println(STV.status);
        STV.setChannel(24);
        STV.channelUp();
        STV.channelUp();
        STV.channelUp();
        System.out.println("Channel (up) : " + STV.channel);
        STV.channelDown();
        STV.channelDown();
        System.out.println("Channel (down) : " + STV.channel);
        System.out.println("volume : " + STV.volume);

    }
}
