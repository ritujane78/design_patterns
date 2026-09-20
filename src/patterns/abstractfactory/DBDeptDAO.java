package patterns.abstractfactory;

public class DBDeptDAO implements DAO {
  @Override
  public void save() {
    System.out.println("Saving Department to DB");
  }
}
