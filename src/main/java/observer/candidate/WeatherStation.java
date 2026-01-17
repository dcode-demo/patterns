package observer.candidate;// BEFORE: tightly coupled, needs Observer pattern

public class WeatherStation {
    private float temperature;

    // Direct references to displays — bad design
    private PhoneDisplay phoneDisplay;
    private WindowDisplay windowDisplay;

    public WeatherStation(PhoneDisplay phoneDisplay, WindowDisplay windowDisplay) {
        this.phoneDisplay = phoneDisplay;
        this.windowDisplay = windowDisplay;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyDisplays();
    }

    private void notifyDisplays() {
        // Explicitly call each display — violates open/closed principle
        phoneDisplay.update(temperature);
        windowDisplay.update(temperature);
    }

    public float getTemperature() {
        return temperature;
    }
}

class PhoneDisplay {
    public void update(float temperature) {
        System.out.println("Phone display shows: " + temperature + "°C");
    }
}

class WindowDisplay {
    public void update(float temperature) {
        System.out.println("Window display shows: " + temperature + "°C");
    }
}
