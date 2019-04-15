public class TesteTemperature {
  public static void main(String[] args) {
    Temperature t = new Temperature(10);
    t.addObserver(new TermometerCelsius ());
    t.addObserver(new TermometerFahrenheit ());
    t.setValue(100);
    t.setValue(50);
    t.setValue(10);
    t.setValue(1);
  }
}