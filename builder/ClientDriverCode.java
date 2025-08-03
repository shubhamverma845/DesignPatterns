package builder;

public class ClientDriverCode {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();

        Car oldCar = builder.setSeats(4).setEngine("Single Cylinder").setTripComputer("yes").setGPSNavigator("yes").build();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        CarManual manualCar = manualBuilder.setSeats(4).setEngine("Single Cylinder").setTripComputer("yes").setGPSNavigator("yes").build();

        System.out.println(manualCar);

        builder.reset();
        DriverClass driver = new DriverClass(builder);
        driver.createSportsCar();
        Car sportsCar = builder.build();

        System.out.println(oldCar);
        System.out.println(sportsCar);

    }
}
