package shapes;

public class Cone extends ThreeD {
    private double height;
    private Circle circle;

    public Cone(Circle circle, double height)
    {
        super(circle.getColor(), circle.getName());
        if (circle.getRadius() < 0 || height < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else {
            this.circle = circle;
            this.height = height;
            super.setVolume((double) 1/3 * pi * circle.getRadius()*circle.getRadius()*height);
        }
    }

    public void setRadius(double radius)
    {
        if (radius < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else
            circle.setRadius(radius);
    }

    public void setHeight(double height)
    {
        if (height < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else {
            this.height = height;
        }
    }

    public double getRadius()
    {
        return circle.getRadius();
    }

    public double getHeight()
    {
        return height;
    }
}
