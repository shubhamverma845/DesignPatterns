package builder;

public class CarManual {

    private final int seats;
    private final String engine;
    private final String tripComputer;
    private final String gpsNavigator;

    public CarManual(CarManualBuilder builder) {
        this.engine = builder.getEngine();
        this.gpsNavigator = builder.getGpsNavigator();
        this.tripComputer = builder.getTripComputer();
        this.seats = builder.getSeats();
    }

    @Override
    public String toString() {
        return "CarManual{" + "seats=" + seats + ", engine=" + engine + ", tripComputer=" + tripComputer + ", gpsNavigator=" + gpsNavigator + '}';
    }
}
