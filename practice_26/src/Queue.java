public interface Queue<E> {
    void enqueue(E element);
    E getElement() throws Exception;
    E dequeue();
    int size();
    boolean isEmpty();
    void clear();
}