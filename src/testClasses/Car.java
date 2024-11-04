package testClasses;

public class Car extends Transport {

    public Car(String name, int horsePower, int capacity, boolean isProprietary) {
        super(name, horsePower, capacity, isProprietary);
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void navigate() {
        System.out.println("Car is naviging");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                ", capacity=" + capacity +
                ", isProprietary=" + isProprietary +
                '}';
    }
}
