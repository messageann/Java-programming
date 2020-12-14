import java.util.LinkedList;

public class ListQ<E> implements Queue<E> {
    private final LinkedList<E> list;

    public ListQ() {
        list = new LinkedList<>();
    }

    @Override
    public void enqueue(E element) {
        list.addLast(element);
    }

    @Override
    public E getElement() throws Exception {
        return list.getFirst();
    }

    @Override
    public E dequeue() {
        E removed = list.getFirst();
        list.removeFirst();
        return removed;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }
}