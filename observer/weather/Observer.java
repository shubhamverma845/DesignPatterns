package observer.weather;

public interface Observer {
    void update(float temp, float humidity, float pressure);
    void update();
}
