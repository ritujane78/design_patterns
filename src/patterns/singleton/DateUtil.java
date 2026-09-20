package patterns.singleton;

public class DateUtil {
  // Eager initialization
  private static DateUtil instance = new DateUtil();
  private DateUtil(){

  }
  public static DateUtil getInstance(){
    return instance;
  }
}
