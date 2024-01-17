package Final;

public class CarDirector {// optional
    private CarBuilder carBuilder;

    public  CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car constructerSportCar(){
        return this.carBuilder.setGps(true).setSeats(2).setTripComputer("AI").setEngine("6.2").build();
    }
}
