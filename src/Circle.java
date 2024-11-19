public class Circle extends TwoD{
   private double radius;

   Circle(String color, String name, double radius){
      if (radius < 0)
      {
         throw new IllegalArgumentException("Negative value");
      }

      else {
         super.setColor(color);
         super.setName(name);
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
