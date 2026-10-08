public class Lamp {


    boolean isOn;
    int watt;

public Lamp (int watt){
this.isOn = false;
this.watt = watt;
}
 public void turnOn(){
isOn = true;
    }

    public void turnOff(){
    isOn = false;
    }

    @Override
    public String toString() {
        return "Watt:" + watt + "isOn" + isOn;
    }
}

