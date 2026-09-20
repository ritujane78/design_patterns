package patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable {

  private static final long serialVersionUID = 1L;

  private static volatile DateUtil instance;
  private DateUtil(){

  }
  public static DateUtil getInstance(){
    if (instance == null){
      synchronized (DateUtil.class) {
        if (instance == null) instance = new DateUtil();
      }
    }

    return instance;
  }
  public Object readResolve(){
    return instance;
  }
}
