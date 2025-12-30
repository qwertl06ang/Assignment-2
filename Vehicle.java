public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected Driver driver;

    public Vehicle(String _brand, int _year, Driver _driver)
    {
        this.brand = _brand;
        this.year = _year;
        this.driver = _driver;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo()
    {
        String info = String.format("Brand: %s, Year: %d", brand, year);
        if (driver != null)
        {
            driver.displayDriverInfo();
        }
        IO.println(info);
    }
}
