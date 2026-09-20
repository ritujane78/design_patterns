package patterns.abstractfactory;

public class XMLEmpDAO implements DAO {
  @Override
  public void save() {
    System.out.println("Saving Employee to XML");
  }
}
