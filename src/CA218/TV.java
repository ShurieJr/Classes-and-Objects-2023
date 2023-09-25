package CA218;
public class TV {
    //variables
    int channel , volume;
    boolean status;
    //constructor no-arg
    TV (){
        channel = 1;
        volume = 1;
        status = false;
    }
    TV(int chnl , int vlme , boolean sts){
        channel = chnl;
        volume = vlme;
        status = sts;
    }
    //methods
    void turnOn(){
        status = true;
    }
    void turnOff(){
        status =  false;
    }
    void channelUp(){
        channel++;
    }
    void channnelDown(){
        channel--;
    }
    void volumeUp(){
        volume++;
    }
    void volumeDown(){
        volume--;
    }
    void setChannel(int value){
        if (value >=1 && value <= 120){
            channel=value;
        }
        else {
            System.out.println("Error! channel not found");
        }
    }

    //main method
    public static void main(String[] args) {
        TV just = new TV();
        TV Astaan = new TV(20 , 5 , true);
        Astaan.setChannel(34);
        System.out.println("status: " + Astaan.status);
        System.out.println("channel: " + Astaan.channel);
        System.out.println("volume : "+ Astaan.volume);
//        just.turnOn();
//        System.out.println("status (on): " + just.status);
//
//        just.setChannel(20);
//        System.out.println("channel: " + just.channel);
//        just.channelUp();
//        just.channelUp();
//        just.channelUp();
//        System.out.println("channel (up) : " + just.channel);
//        just.channnelDown();
//        just.channnelDown();
//        System.out.println("channel (down): " + just.channel);
    }


}
