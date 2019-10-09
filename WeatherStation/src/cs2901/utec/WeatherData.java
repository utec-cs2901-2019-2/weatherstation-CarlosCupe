package dependences;
import java.utils.Random;

public class WeatherData implements Subject {
    
    Random rand;

    public static void main () {
        rand = new Random ();
    }

    public int getTemperature () {
        return rand.nextInt(60);
    }

    public int getHumidity () {
        return rand.nextInt(60);
    }

    public int getPreassure () {
        return rand.nextInt(60);
    }

    public void measurementsChanged () {
        notifyObservers ();
    }
}
