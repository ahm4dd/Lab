package shapes;

public class RectangularPrison extends ThreeD{
    private double length;
    private double base;
    private double height;

    public RectangularPrison(String color, String name, double length, double base, double height){
        if (length < 0 || base < 0 || height < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else {
            super.setColor(color);
            super.setName(name);
            this.length = length;
            this.base = base;
            this.height = height;
            super.setVolume(length*height*base);
        }
    }

    public void setHeight(double height) {
        if (height < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else
            this.height = height;
    }

    public void setLength(double length) {
        if (length < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else
            this.length = length;
    }

    public void setBase(double base) {
        if (base < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else
            this.base = base;
    }

    public double getLength()
    {
        return length;
    }

    public double getBase()
    {
        return base;
    }

    public double getHeight()
    {
        return height;
    }
}
