package operations;

public interface Operations<T> {
    String ADD = "add";
    String GET = "get";
    String REMOVE = "remove";
    String ADD_ALL = "addAll";
    String EXIT = "exit";

    void add(T item);
    T get(int index);
    void remove();
    void addAll();
    void optimizeSize();
}
