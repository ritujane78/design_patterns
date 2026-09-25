package patterns.observer;

public class WebDisplay implements Observer {
  @Override
  public void update(double price) {
    System.out.println("Web Display: Stock price updated to " +price);
  }
}
