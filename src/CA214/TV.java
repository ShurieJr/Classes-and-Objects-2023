package CA214;
public class TV {
    int channel;
    int volume;
    boolean status;
    TV(){
        channel = 1;
        volume  = 1;
        status = false;
    }
    //methods
    void turnOn(){
        status = true;
        System.out.println("tv turned on!");
    }
    void turnOff(){
        status = false;
        System.out.println("tv turned off!");
    }

    void channelUp(){
        if(status == true & channel < 120) {
            channel++;
            System.out.println("channel up!");
        }
    }
    void channelDown(){
        if(status == true & channel > 1) {
            channel--;
            System.out.println("channel down!");
        }
    }
    void volumeUp(){
        if(status  & volume < 20){
            volume++;
            System.out.println("volume up!");
        }
    }
    void volumeDown(){
        if(status  & volume > 1){
            volume--;
            System.out.println("volume down!");
        }
    }

    //main method
    public static void main(String[] args) {
        TV Astaan = new TV();
        Astaan.turnOn();
        Astaan.channelUp();
        Astaan.channelUp();
        Astaan.channelDown();
        System.out.println("Channel: " + Astaan.channel);

        System.out.println("VOlume: " + Astaan.volume );
        Astaan.volumeUp();
        Astaan.volumeUp();
        Astaan.volumeUp();
        Astaan.volumeUp();
        System.out.println("VOlume: " + Astaan.volume );

        Astaan.turnOff();

    }
}
