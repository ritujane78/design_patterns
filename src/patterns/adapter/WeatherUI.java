package patterns.adapter;

public class WeatherUI {
  public void showTemperature(int zipcode){
    WeatherAdapter weatherAdapter = new WeatherAdapter();
    System.out.println(weatherAdapter.findTemperature((19406)));
  }

  static void main(String[] args) {
    WeatherUI weatherUI = new WeatherUI();
    weatherUI.showTemperature(19406);
  }

}
