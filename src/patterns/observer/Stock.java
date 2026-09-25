package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{

  private List<Observer> observers = new ArrayList<>();
  private double price;

  public void setPrice(double price) {
    this.price = price;
    notifyObservers();
  }

  @Override
  public void register(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void remove(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(price);    }
  }
}
