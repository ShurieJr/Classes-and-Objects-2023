package CA218;
public class Lamp {
    boolean lightStatus;

    void lightOn(){
        lightStatus = true;
    }
    void lightOff (){
        lightStatus = false;
    }

    boolean getStatus(){
      return  lightStatus;
    }
}
