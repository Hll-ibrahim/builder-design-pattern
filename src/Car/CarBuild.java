package Car;

public class CarBuild {
    public static void main(String[] args){
        Car car = new CarBuilder().startBuild().setMarka("Fiat").setModel("Doblo").setSene(2006).build();
        System.out.println(car);
    }
}
