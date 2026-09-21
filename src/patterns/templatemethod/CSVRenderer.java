package patterns.templatemethod;

public class CSVRenderer extends DataRenderer{
  @Override
  public String readData() {
    return "CSV Data";
  }

  @Override
  public String processData(String data) {
    return "processed "+ data;
  }
}
