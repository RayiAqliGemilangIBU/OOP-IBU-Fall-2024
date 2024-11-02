package lab5;

class Truck extends Vehicle implements Repairable {

    public Truck(String modelName) {
        super(modelName);
    }


    public Truck(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String service() {
        return "Service for truck " + getModelName() + ": Overhaul engine, replace tires. Mileage: " + getMileage() + ", Health: " + getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 300000;
    }

    @Override
    public String repair() {
        return "Engine overhauled and tires replaced for " + getModelName();
    }


    public void haul(int loadWeight) {
        setMileage(getMileage() + loadWeight / 100);
        setHealth(getHealth() - loadWeight / 500);
        if (getHealth() < 40) {
            System.out.println("Remaining lifespan reduced due to heavy load strain.");
        }
    }
}
