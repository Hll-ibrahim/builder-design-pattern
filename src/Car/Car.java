package Car;

public class Car {
    private String marka;
    private String model;
    private int sene;
    private double motorHacmi;
    private String renk;

    public Car(String marka, String model, int sene, double motorHacmi, String renk) {
        this.marka = marka;
        this.model = model;
        this.sene = sene;
        this.motorHacmi = motorHacmi;
        this.renk = renk;
    }
    public Car(){}

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", sene=" + sene +
                ", motorHacmi=" + motorHacmi +
                ", renk='" + renk + '\'' +
                '}';
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSene(int sene) {
        this.sene = sene;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
