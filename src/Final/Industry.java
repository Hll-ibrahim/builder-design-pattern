package Final;

public class Industry {
    public static void main(String[] args){

        CarBuilder carBuilder = new CarBuilder();
        Car car1 = carBuilder.setSeats(4).setGps(false).build();

        CarDirector director = new CarDirector(new CarBuilder());
        Car car2 = director.constructerSportCar();
        System.out.println(car1);
        System.out.println(car2);
    }
}
