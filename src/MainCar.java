public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("porsche");
        car.setModel("Carrerra");
        car.setColor("Red");
        car.setDoors(4);
        car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}
