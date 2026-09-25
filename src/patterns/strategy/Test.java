package patterns.strategy;

public class Test {

  static void main(String[] args) {
    PaymentContext context = new PaymentContext();

    context.setStrategy(new CreditCardPayment());
    context.execute(500);
  }
}
