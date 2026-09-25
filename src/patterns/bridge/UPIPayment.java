package patterns.bridge;

public class UPIPayment extends Payment {
  public UPIPayment(Bank bank) {
    super(bank);
  }

  @Override
  public void makePayment(String accountNumber, Double amount) {
    System.out.println("Using UPI Payment");
    bank.processPayment(accountNumber, amount);
  }
}
