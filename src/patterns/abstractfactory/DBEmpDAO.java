package patterns.abstractfactory;

public class DBEmpDAO implements DAO {
  @Override
  public void save() {
    System.out.println("Saving Employee to DB");
  }
}
