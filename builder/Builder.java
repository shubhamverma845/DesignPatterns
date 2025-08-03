package builder;

public interface Builder {
    void reset();
    Builder setSeats(int seats);
    Builder setEngine(String engine);
    Builder setTripComputer(String tripComputer);
    Builder setGPSNavigator(String gpsNavigator);
}
