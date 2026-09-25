package patterns.strategy;

public class UPIPayment implements PaymentStrategy {
  @Override
  public void pay(int amount) {
    System.out.println("Paid " +amount + " via UPI.");
  }
}
