package operations;

public interface Operations<T> {
    String ADD = "add";
    String GET = "get";
    String REMOVE = "remove";
    String ADD_ALL = "addAll";
    String EXIT = "exit";

    void add(T item);
    T get(int index);
    void remove(int index);
    void addAll(T[] items);
    Object[] increaseSize(Object[] array, int newLength);
    Object[] reduceSize(Object[] array, int newLength);
    boolean isEmpty(T item);
    int findLastElement(Object[] array);
    int getSize();
    int getElementsCount();
    void clear();
}
