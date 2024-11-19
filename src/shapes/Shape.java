package shapes;

public class Shape {
    private String color;
    private String name;

    public Shape()
    {

    }

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName()
    {
        return name;
    }
}
