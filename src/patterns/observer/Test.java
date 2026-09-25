package patterns.observer;

public class Test {
  static void main(String[] args) {
    Stock stock = new Stock();
    stock.register(new MobileDisplay());
    stock.register(new WebDisplay());

    stock.setPrice(100.2);
    stock.setPrice(200.4);
  }
}
