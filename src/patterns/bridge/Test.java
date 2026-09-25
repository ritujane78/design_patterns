package patterns.bridge;

public class Test {
  static void main(String[] args) {
    ABCBank abcBank = new ABCBank();
    XYZBank xyzBank = new XYZBank();

    UPIPayment upiPayment = new UPIPayment(abcBank);
    upiPayment.makePayment("abc123", 4000.00);

    CardPayment cardPayment = new CardPayment(xyzBank);
    cardPayment.makePayment("xyz123", 2000.00);
  }
}
