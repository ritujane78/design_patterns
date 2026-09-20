package patterns.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory{

  @Override
  public DAO createDao(String type) {
    DAO dao = null;
    if(type.equalsIgnoreCase("emp")){
      dao = new DBEmpDAO();
    } else if (type.equalsIgnoreCase("dept")){
      dao = new DBDeptDAO();
    }
    return null;
  }
}
