package Final;

public class CarBuilder implements Builder{
    private Car car;
    public CarBuilder(){
        this.reset();
    }
    public void reset(){
        this.car = new Car();
    }

    public CarBuilder setSeats(int seats) {
        this.car.setSeats(seats);
        return this;
    }

    public CarBuilder setEngine(String engine) {
        this.car.setEngine(engine);
        return this;
    }

    public CarBuilder setTripComputer(String setTripComputer) {
        this.car.setTripComputer(setTripComputer);
        return this;
    }

    public CarBuilder setGps(boolean gps) {
        this.car.setGps(gps);
        return this;
    }

    public Car build(){
        if(this.car.getEngine() == null){
            return null;
        }
        return this.car;
    }
}
