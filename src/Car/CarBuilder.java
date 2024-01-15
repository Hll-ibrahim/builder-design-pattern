package Car;

public class CarBuilder {
    private String marka;
    private String model;
    private int sene;
    private double motorHacmi;
    private String renk;

    public CarBuilder startBuild(){
        return new CarBuilder();
    }

    public Car build(){
        Car car = new Car();
        car.setMarka(this.marka);
        car.setModel(this.model);
        car.setSene(this.sene);
        car.setRenk(this.renk);
        car.setMotorHacmi(this.motorHacmi);
        return car;
    }



    public CarBuilder setMarka(String marka) {
        this.marka = marka;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setSene(int sene) {
        this.sene = sene;
        return this;
    }

    public CarBuilder setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
        return this;
    }

    public CarBuilder setRenk(String renk) {
        this.renk = renk;
        return this;
    }
}
