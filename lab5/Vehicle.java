package lab5;

abstract class Vehicle {
    private String modelName;
    private int mileage;
    private int health;


    public Vehicle(String modelName) {
        this.modelName = modelName;
        this.mileage = 0;
        this.health = 100;
    }


    public Vehicle(String modelName, int mileage, int health) {
        this.modelName = modelName;
        this.mileage = mileage;
        this.health = health;
    }


    public String getModelName() {
        return modelName;
    }

    public int getMileage() {
        return mileage;
    }

    public int getHealth() {
        return health;
    }


    protected void setMileage(int mileage) {
        this.mileage = mileage;
    }

    protected void setHealth(int health) {
        this.health = health;
    }


    public abstract String service();
    public abstract int expectedLifespan();


    public int calculateRemainingLifespan() {
        int baseLifespan = expectedLifespan();
        if (health < 50) {
            baseLifespan -= baseLifespan * (100 - health) / 100;
        }
        return baseLifespan - mileage;
    }


    public boolean needsMaintenance() {
        return health < 70;
    }


    public void simulateYear() {
        if (mileage > expectedLifespan() / 2) {
            health -= 5;
        }
    }


    public void performMaintenance(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.repair();
            car.drive(50);
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            truck.repair();
            truck.haul(1000);
        } else if (vehicle instanceof Motorcycle) {
            Motorcycle motorcycle = (Motorcycle) vehicle;
            motorcycle.race(50);
        }
    }
}
