package patterns.bridge;

public class ABCBank implements Bank {
  @Override
  public void processPayment(String accountNumber, Double amount) {
    System.out.println("Processing Payment of " + amount +
      " through ABC Bank for the account " + accountNumber);
  }
}
