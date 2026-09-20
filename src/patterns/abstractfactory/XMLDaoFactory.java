package patterns.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory{

  @Override
  public DAO createDao(String type) {
    DAO dao = null;
    if(type.equalsIgnoreCase("emp")){
      dao = new XMLEmpDAO();
    } else if (type.equalsIgnoreCase("dept")){
      dao = new XMLDeptDAO();
    }
    return dao;
  }
}
