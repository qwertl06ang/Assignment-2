public class Truck extends Vehicle{

    public double capacity;
    public int numAxles;

    public Truck(String _brand, int _year, Driver _driver, double capacity, int numAxles) {
        super(_brand, _year, _driver);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        IO.println("Truck: " + brand + " Engine Started");
    }

    @Override
    public void stopEngine() {
        IO.println("Truck: " + brand + " Engine Stopped");
    }
}
