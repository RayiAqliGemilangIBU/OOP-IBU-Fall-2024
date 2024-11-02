package lab5;

class Motorcycle extends Vehicle {

    public Motorcycle(String modelName) {
        super(modelName);
    }


    public Motorcycle(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String service() {
        return "Service for motorcycle " + getModelName() + ": Lubricate chain and tune engine. Mileage: " + getMileage() + ", Health: " + getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 50000;
    }


    public void race(int raceMiles) {
        setMileage(getMileage() + raceMiles);
        setHealth(getHealth() - raceMiles / 50);
        if (getHealth() < 40) {
            System.out.println("Remaining lifespan reduced due to racing strain.");
        }
    }
}
