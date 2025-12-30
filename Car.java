public class Car extends Vehicle {
    public int doors;
    public String fuelType;

    public Car(String _brand, int _year, Driver _driver, int _doors, String fuelType) {
        super(_brand, _year, _driver);
        this.doors = _doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        IO.println("Car: " + brand + " Engine Started");
    }

    @Override
    public void stopEngine() {
        IO.println("Car: " + brand + " Engine Stopped");
    }
}
