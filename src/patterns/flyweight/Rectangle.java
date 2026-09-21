package patterns.flyweight;

public class Rectangle extends Shape {

  private String label;
  private int length;
  private int breadth;
  private String fillStyle;

  public Rectangle() {
    label = "rectangle";
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getBreadth() {
    return breadth;
  }

  public void setBreadth(int breadth) {
    this.breadth = breadth;
  }

  public String getFillStyle() {
    return fillStyle;
  }

  public void setFillStyle(String fillStyle) {
    this.fillStyle = fillStyle;
  }

  @Override
  public void draw(int length, int breadth, String fillStyle){
    System.out.println("Drawing a "+ label + " with length = "+ length + " and breadth = "+ breadth + " and fillStyle = "+ fillStyle);
  }
}
