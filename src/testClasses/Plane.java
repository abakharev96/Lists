package testClasses;

public class Plane extends Transport {
    public Plane(String name, int horsePower, int capacity, boolean isProprietary) {
        super(name, horsePower, capacity, isProprietary);
    }

    @Override
    public void move() {
        System.out.println("The plane is moving.");
    }

    @Override
    public void navigate() {
        System.out.println("The plane is naviging.");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                ", capacity=" + capacity +
                ", isProprietary=" + isProprietary +
                '}';
    }
}
