package patterns.abstractfactory;

public abstract class DaoAbstractFactory {
  public abstract DAO createDao(String type);
}
