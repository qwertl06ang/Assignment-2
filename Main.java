void main() {

    Driver driver1 = new Driver("Adil", "100-01");
    Driver driver2 = new Driver("Tamerlan", "101-02");

    Car car = new Car("Changan", 2023, driver1, 4, "gas");
    Motorcycle motorcycle = new Motorcycle("Yamaha", driver1, 2025, false);
    Truck truck = new Truck("Man", 2022, driver2, 100, 5);

    Vehicle[] vehicles = new Vehicle[]{car, motorcycle, truck};

    for (Vehicle v: vehicles)
    {
        v.startEngine();
        v.displayInfo();
        v.stopEngine();
    }
}
