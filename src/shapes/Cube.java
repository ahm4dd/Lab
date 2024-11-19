package shapes;

public class Cube extends ThreeD {
    private Square square;

    public Cube(Square square)
    {
        if (square.getSide() < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else {

            super.setColor(square.getColor());
            super.setName(square.getName());
            this.square = square;
            super.setVolume(square.getSide()*square.getSide()*square.getSide());
        }
    }

    public void setSide(double side)
    {
        square.setSide(side);
    }

    public double getSide()
    {
        return square.getSide();
    }
}

