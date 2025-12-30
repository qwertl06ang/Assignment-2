public class Driver {
    public String name;
    public String licenseNumber;

    public Driver(String name, String licenseNumber)
    {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public void displayDriverInfo()
    {
        String info = String.format("Name: %s, License: %s", name, licenseNumber);
        IO.println(info);
    }
}
