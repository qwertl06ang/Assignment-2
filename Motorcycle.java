public class Motorcycle extends Vehicle{

    public boolean hasSidecar;

    public Motorcycle(String _brand, Driver _driver, int _year, boolean hasSidecar) {
        super(_brand, _year, _driver);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        IO.println("Motorcycle: " + brand + " Engine Started");
    }

    @Override
    public void stopEngine() {
        IO.println("Motorcycle: " + brand + " Engine Stop");
    }
}
