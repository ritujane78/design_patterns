package patterns.observer;

public class MobileDisplay implements Observer {
  @Override
  public void update(double price) {
    System.out.println("Mobile Display: Stock price updated to " +price);
  }
}
