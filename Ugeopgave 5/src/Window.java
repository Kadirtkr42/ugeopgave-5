public class Window {

    int widthCm;
    int heightCm;


    public Window(int widthCm, int heightCm){
        this.widthCm = widthCm;
        this.heightCm = heightCm;

    }

    public int getAreaCm2(){
        return widthCm * heightCm;

    }

    @Override
    public String toString() {
        return "Bredde:" + widthCm + "cm." + "Højde:" + heightCm + "cm." + "Areal:" + getAreaCm2();
    }
}
