package patterns.decorator;

public class PizzaShop {
  static void main(String[] args) {
    Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
    pizza.bake();
  }
}
