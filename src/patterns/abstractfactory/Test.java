package patterns.abstractfactory;

public class Test {
  static void main(String[] args) {
    DaoAbstractFactory daf = DaoFactoryProducer.produce("xml");
    DAO dao = daf.createDao("emp");
    dao.save();
  }
}
