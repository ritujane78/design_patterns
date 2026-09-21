package patterns.flyweight;

public class Circle extends Shape {

  private String label;

  @Override
  public void draw(int radius, String lineColor, String fillColor) {
    System.out.println("Drawing a " + label + " with radius = " + radius + " line color = " + lineColor +
      " and fill color = "+ fillColor);
  }
}
