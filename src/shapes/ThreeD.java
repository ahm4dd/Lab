package shapes;

public class ThreeD extends TwoD {
    private double volume;

    public ThreeD(String name, String color){
        super(name, color);
    }

    public void setVolume(double volume){
            this.volume = volume;
    }

    public double getVolume()
    {
        return volume;
    }
}
