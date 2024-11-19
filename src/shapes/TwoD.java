public class TwoD extends Shape{
    private double area;
    final public double pi = 3.14;

    public void setArea(double area){
        if (area < 0)
        {
            throw new IllegalArgumentException("Negative value");
        }
        else
            this.area = area;
    }

    public double getArea(){
        return area;
    }
}
