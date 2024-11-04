import arrayList.ArrayList;
import operations.Operations;

import java.util.Scanner;

public class List {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Instructions");
        String input = scanner.nextLine();

        ArrayList<Object> arrayList = new ArrayList<>();

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
    }
}
