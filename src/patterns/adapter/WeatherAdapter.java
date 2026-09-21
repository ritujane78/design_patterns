package patterns.adapter;

public class WeatherAdapter {
  public int findTemperature(int zipcode){
    String city = null;
    if(zipcode == 19406){
      city = "King of Prussia";
    }
    int temperature = new WeatherFinderImpl().find(city);
    return temperature;
  }
}
