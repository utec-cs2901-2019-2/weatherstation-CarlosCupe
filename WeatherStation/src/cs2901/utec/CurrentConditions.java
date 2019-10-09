
public class CurrentConditions implements Observer, DisplayElement {
    private int temperature;
    private int humidity;
    private int preassure;
    
    WeatherData subject;

    public static void main () {
    }

    public void setSubject (WeatherData subject_t) {
        subject = subject_t;
    }

    @override
    void update () {
        temperature = subject.getTemperature();
        humidity = subject.getHumidity();
        preassure = subject.getPreassure();
        
    }
    
    @override
    void display {
        System.out.println ("Temperature: " + temperature);
        System.out.println ("Humidity: " + humidity);
        System.out.println ("Preassure: " + preassure);
    }
}
