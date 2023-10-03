package CA2110;
public class TV {
   static int channel, volume;
    boolean status;
    TV(){
        channel = 1;
        volume = 1;
        status = false;
    }
    void turnOn(){
        status = true;
    }
    void turnOff(){
        status = false;
    }
   static void channelUp(){
        if(channel <= 120){
            channel++;
        }
        else{
            System.out.println("channel out of range!");
        }
    }
   static void channelDown(){
        if(channel > 1){
            channel--;
        }
        else {
            System.out.println("out of range!");
        }

    }

    void volumeUp(){
        if(volume <= 100){
            volume++;
        }
        else{
            System.out.println("out of rang!");
        }
    }
    void volumeDown(){
        if(volume > 1){
            volume--;
        }
        else{
            System.out.println("out of range!");
        }
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public static void main(String[] args) {
        TV obj = new TV();
        channelUp();
        System.out.println("channel: " + channel);
        channelDown();
        System.out.println("channel: " + channel);

    }
}
