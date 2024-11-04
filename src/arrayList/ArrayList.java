package arrayList;

import operations.Operations;
import java.util.Arrays;

public class ArrayList<T> implements Operations {

    private final int initSize = 10;
    private Object[] array = new Object[initSize];

    @Override
    public void add(Object item) {
        int index = findLastElement(array);
        if (index == -1) {
            array = increaseSize(array, array.length * 2) ;
            index = findLastElement(array);
        }
        array[index] = (T) item;
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public void remove(int index) {
        int lastElementIndex = findLastElement(array) - 1;
        for (int i = index; i < lastElementIndex; i++) {
            array[i] = array[i + 1];
        }
        array[lastElementIndex] = null;

        if (lastElementIndex < array.length / 4) {
            array = reduceSize(array, array.length / 2) ;
        }
    }

    @Override
    public void addAll(Object[] items) {
        for (Object item : items) {
            add(item);
        }
    }

    @Override
    public Object[] increaseSize(Object[] array, int newLength) {
        int lastElementIndex = findLastElement(array);
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    @Override
    public Object[] reduceSize(Object[] array, int newLength) {
        int lastElementIndex = findLastElement(array);
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, newLength);
        return newArray;
    }

    @Override
    public boolean isEmpty(Object item) {
        return item == null;
    }

    @Override
    public int findLastElement(Object[] item) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    @Override
    public int getSize() {
        return array.length;
    }

    @Override
    public int getElementsCount() {
        return findLastElement(array);
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
