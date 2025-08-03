package builder;

public class CarBuilder implements Builder {

    private int seats;
    private String engine;
    private String tripComputer;
    private String gpsNavigator;

    public int getSeats() {
        return seats;
    }

    public String getGpsNavigator() {
        return gpsNavigator;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public void reset() {
        seats = 0;
        engine = null;
        tripComputer = null;
        gpsNavigator = null;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public CarBuilder setGPSNavigator(String gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Car build() {
        return new Car(this);
    }
}
