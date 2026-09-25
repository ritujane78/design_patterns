package patterns.bridge;

public class XYZBank implements Bank {
  @Override
  public void processPayment(String accountNumber, Double amount) {
    System.out.println("Processing Payment of " + amount +
      " through XYZ Bank for the account " + accountNumber);
  }
}
