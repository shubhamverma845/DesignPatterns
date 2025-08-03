package builder;

public class DriverClass {
    Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    DriverClass(Builder builder) {
        this.builder = builder;
    }

    void createSportsCar() {
        builder.setSeats(4);
        builder.setEngine("V8");
        builder.setTripComputer("yes");
        builder.setGPSNavigator("yes");
    }
}
