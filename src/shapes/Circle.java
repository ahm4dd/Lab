package shapes;

public class Circle extends TwoD{
   private double radius;

   public Circle(String color, String name, double radius){
      super(color, name);
      if (radius < 0)
      {
         throw new IllegalArgumentException("Negative value");
      }

      else {
         this.radius = radius;
         super.setArea(radius*radius*pi);
      }
   }

   public void setRadius(double radius){
      if (radius < 0)
      {
         throw new IllegalArgumentException("Negative value");
      }
      else
         this.radius = radius;
   }

   public double getRadius(){
      return radius;
   }
}
