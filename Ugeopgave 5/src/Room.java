import java.util.ArrayList;

public class Room {

    String name;
    ArrayList<Lamp> lamps = new ArrayList<>();
    ArrayList<Window> windows = new ArrayList<>();


    public Room(String name){
this.name = name;
    }

    void addLamp(Lamp lamp){
lamps.add(lamp);
    }
    void addWindow (Window window){
windows.add(window);
    }
    public int getLampCount(){
return lamps.size();

    }
    public int getTotalWatt(){
int total = 0;

for (Lamp lamp : lamps){
    total += lamp.watt;
} return total;
    }

    int getTotalWindowArea(){
         int total = 0;
         for (Window window : windows){
             total += window.getAreaCm2();
         } return total;
    }
    void printRoom(){
        System.out.println("Rum:" +  name);
        System.out.println("Antal lamper:" + getLampCount());
        System.out.println("Samlet watt:" + getTotalWatt());
        System.out.println("Samlet vinduesareal" + getTotalWindowArea());
    }

}

