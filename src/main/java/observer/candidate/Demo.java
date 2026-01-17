package observer.candidate;

public class Demo {
    public static void main(String[] args) {
        PhoneDisplay phone = new PhoneDisplay();
        WindowDisplay window = new WindowDisplay();

        WeatherStation station = new WeatherStation(phone, window);
        station.setTemperature(22.5f);
        station.setTemperature(25.0f);
    }
}