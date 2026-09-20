package patterns.abstractfactory;

public class DaoFactoryProducer {
  public static DaoAbstractFactory produce(String factoryType){
    DaoAbstractFactory factory = null;
    if (factoryType.equalsIgnoreCase("xml")){
      factory = new XMLDaoFactory();
    }else if (factoryType.equalsIgnoreCase("db")){
      factory = new DBDaoFactory();
    }return factory;
  }
}
