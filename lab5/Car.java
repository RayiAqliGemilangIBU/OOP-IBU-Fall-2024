package lab5;

class Car extends Vehicle implements Repairable {

    public Car(String modelName) {
        super(modelName);
    }


    public Car(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String service() {
        return "Service for car " + getModelName() + ": Check engine, change oil. Mileage: " + getMileage() + ", Health: " + getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 150000;
    }

    @Override
    public String repair() {
        return "Engine tuned and oil changed for " + getModelName();
    }


    public void drive(int miles) {
        setMileage(getMileage() + miles);
        setHealth(getHealth() - miles / 100);
        if (getHealth() < 30) {
            System.out.println("Remaining lifespan reduced due to low health.");
        }
    }
}
