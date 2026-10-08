import java.util.ArrayList;

public class Building {

    String name;
    ArrayList<Room> rooms = new ArrayList<>();


    public Building(String name) {
        this.name = name;
    }

    void addRoom (Room room){
        rooms.add(room);
    }

    public int getTotalLampcount(){
        int total = 0;
        for (Room room : rooms){
            total += room.getLampCount();
        } return total;
    }

    public int getTotalWatt(){
int total = 0;
for (Room room : rooms){
    total += room.getTotalWatt();
}
return total;
    }

    public void printBuilding(){
        System.out.println("Bygning:" + name);

        for (Room room : rooms){
            System.out.println(room.name);

        for (Lamp lamp : room.lamps){
            System.out.println(lamp);
        }
        for (Window window : room.windows){
            System.out.println(window);
        }
    }

}

}
