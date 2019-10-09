
java.utils.Array;

public class StatisticsDisplay implements Observer, DisplayElements {
    private int min;
    private int max;
    private float average;

    WeatherData subject;

    public static void main () {
        min = 0;
        max = 0;
    }
    
    public void setSubject (WeatherData subject_t) {
        subject = subject_t;
    }

    @override
    public void update () {
        int[] arr = new int[3];

        arr[0] = subject.getTemperature();
        arr[1] = subject.getHumidity();
        arr[2] = subject.getPreassure();

        Array.sort(arr);

        min = arr[0];
        max = arr[2];
        
        int sum = min + max + arr[1];

        average = sum / 3;
    }

    @override
    public void display () {
        System.out.println ("Min value: " + min);
        System.out.println ("Max value: " + max);
        System.out.println ("Average value: " + average);
    }
}
