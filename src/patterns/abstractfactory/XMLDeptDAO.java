package patterns.abstractfactory;

public class XMLDeptDAO implements DAO {
  @Override
  public void save() {
    System.out.println("Saving Department to XML");
  }
}
