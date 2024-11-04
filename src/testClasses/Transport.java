package testClasses;

public abstract class Transport {
    public String name;
    public int horsePower;
    public int capacity;
    public boolean isProprietary;

    public Transport(String name, int horsePower, int capacity, boolean isProprietary) {
        this.name = name;
        this.horsePower = horsePower;
        this.capacity = capacity;
        this.isProprietary = isProprietary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isProprietary() {
        return isProprietary;
    }

    public void setProprietary(boolean proprietary) {
        isProprietary = proprietary;
    }

    public abstract void move();
    public abstract void navigate();

}
