package shapes;

public class Sphere extends ThreeD{
    private Circle circle;

    public Sphere(Circle circle)
    {
        super(circle.getColor(), circle.getName());
        if (circle.getRadius() < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else {
            this.circle = circle;
            super.setVolume(((double) 4/3)*pi*(circle.getRadius()*circle.getRadius()*circle.getRadius()));
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

    public double getRadius() {
        return circle.getRadius();
    }
}
