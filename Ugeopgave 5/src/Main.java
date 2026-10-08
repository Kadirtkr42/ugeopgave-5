public class Main{

public static void main(String[] args) {
Building building = new Building("Mit crib");
Room Stue = new Room("Stue");
Stue.addLamp(new Lamp(60));
Stue.addLamp(new Lamp(60));
Stue.addWindow(new Window(100, 125));
building.addRoom(Stue);

Room Mødelokale = new Room("Møselokale");
Mødelokale.addLamp(new Lamp(60));
Mødelokale.addLamp(new Lamp(60));
Mødelokale.addLamp(new Lamp(100));
Mødelokale.addWindow(new Window(120, 90));
Mødelokale.addWindow(new Window(120, 90));
building.addRoom(Mødelokale);

Room Køkken = new Room("Køkken");
    Mødelokale.addLamp(new Lamp(40));
    Mødelokale.addLamp(new Lamp(40));
    Mødelokale.addWindow(new Window(60, 60));
building.addRoom(Køkken);

building.printBuilding();

    System.out.println("Antal lamper i hele bygningen:" + " " + building.getTotalLampcount());
    System.out.println("Samlet antal watt i bygningen: " + building.getTotalWatt() + " W");

 }

}
