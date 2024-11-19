package shapes;

public class Square extends TwoD {
    private double side;

    public Square(String color, String name, double side)
    {
        super(color, name);
        if (side < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else {
            setSide(side);
            super.setArea(side*side);
        }
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side){
        if (side < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else
            this.side = side;
    }
}
