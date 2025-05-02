    package observer.weather;

    public class CurrentConditionsDisplay implements DisplayElement, Observer {

        private float temperature;
        private float humidity;
        private WeatherData weatherData;

        public CurrentConditionsDisplay(WeatherData weatherData) {
            this.weatherData = weatherData;
            weatherData.registerObserver(this);
        }

        @Override
        public void display() {
            System.out.println("Current Conditions: " + temperature + "F degrees and " + humidity + "% humidity");
        }

        @Override
        public void update(float temp, float humidity, float pressure) {
            this.temperature = temp;
            this.humidity = humidity;
            display();
        }

        @Override
        public void update() {
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
