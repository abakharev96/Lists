package arrayList;

import operations.Operations;

import java.util.Arrays;

public class ArrayList<T> implements Operations {

    private final int initSize = 10;
    private Object[] array = new Object[initSize];

    @Override
    public void add(Object item) {

    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public void remove() {

    }

    @Override
    public void addAll() {

    }

    @Override
    public void optimizeSize() {

    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
