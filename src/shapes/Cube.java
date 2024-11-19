package shapes;

public class Cube extends ThreeD {
    private Square square;

    public Cube(Square square)
    {
        super(square.getColor(), square.getName());
        if (square.getSide() < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else {
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

