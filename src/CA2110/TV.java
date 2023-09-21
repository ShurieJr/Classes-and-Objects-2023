package CA2110;
public class TV {
    int channel , volume;
    boolean status;

    TV(){
        channel = 1;
        volume = 1;
        status = false;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    void turnOn(){
        status = true;
    }
    void turnOff(){
        status = false;
    }

    void channelUp(){
        if(channel < 120)
             channel++;
    }
    void channelDown(){
        if(channel > 1)
            channel--;
    }

    void volumeUp(){
        volume++;
    }
    void volumeDown(){
        volume--;
    }

    //main method
    public static void main(String[] args) {
        TV Bile = new TV();

        Bile.turnOn();
        Bile.setChannel(2);
        Bile.channelDown();
        System.out.println("Status: " + Bile.status);
        System.out.println("Channel: " + Bile.channel);
        System.out.println("volume: " + Bile.volume);
    }
}
