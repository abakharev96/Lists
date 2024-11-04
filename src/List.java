import arrayList.ArrayList;
import operations.Operations;
import testClasses.Car;
import testClasses.Plane;

import java.util.Scanner;

public class List {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Instructions");
        //String input = scanner.nextLine();

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("car1", 150, 5, false));
        cars.add(new Car("car2", 80, 5, false));
        cars.add(new Car("car3", 230, 5, false));
        cars.add(new Car("car4", 500, 5, false));
        cars.add(new Car("car5", 180, 5, false));
        cars.add(new Car("car6", 129, 5, false));
        cars.add(new Car("car7", 165, 5, false));
        cars.add(new Car("car8", 500, 2, false));
        cars.add(new Car("car9", 98, 5, false));
        cars.add(new Car("car10", 300, 5, false));
        cars.add(new Car("car11", 73, 5, false));
        cars.add(new Car("car12", 143, 5, false));

        System.out.println(cars);
        System.out.println(cars.get(11));
        System.out.println("Array length is " + cars.getSize() + ", filled elements " + cars.getElementsCount());

        cars.remove(1);
        cars.remove(0);
        cars.remove(0);
        cars.remove(0);
        cars.remove(0);
        cars.remove(5);
        cars.remove(2);
        cars.remove(4);
        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println("Array length is " + cars.getSize() + ", filled elements " + cars.getElementsCount());

        cars.clear();
        System.out.println("Array length is " + cars.getSize() + ", filled elements " + cars.getElementsCount());

        Car[] carsArray = {new Car("car1", 150, 5, false),
                new Car("car2", 80, 5, false),
                new Car("car3", 230, 5, false),
                new Car("car4", 500, 5, false),
                new Car("car5", 180, 5, false),
                new Car("car6", 129, 5, false),
                new Car("car7", 165, 5, false),
                new Car("car8", 500, 2, false),
                new Car("car9", 98, 5, false),
                new Car("car10", 300, 5, false),
                new Car("car11", 73, 5, false),
                new Car("car12", 143, 5, false)};
        cars.addAll(carsArray);
        System.out.println("Array length is " + cars.getSize() + ", filled elements " + cars.getElementsCount());




        /*
        while(!input.equals(Operations.EXIT)) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {
                case(Operations.ADD): {
                    arrayList.add(tokens[1]);
                    break;
                }
            }
        }
         */
    }
}
