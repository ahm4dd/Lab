public class Sphere extends ThreeD{
    private Circle circle;

    Sphere(Circle circle)
    {
        if (circle.getRadius() < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else {
            super.setName(circle.getName());
            super.setColor(circle.getColor());
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
