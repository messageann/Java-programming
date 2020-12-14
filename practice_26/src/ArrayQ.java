import java.util.ArrayList;

public class ArrayQ<E> implements Queue {
    private Object[] arr;
    private int size;

    public ArrayQ(){
        Object arr = new Object[0];
        size = 0;
    }
    @Override
    public void enqueue(Object element) {
        size++;
        Object[] temp = new Object[size];
        for (int i = 0; i < size - 1; i++) temp[i] = arr[i];
        temp[size - 1] = element;
        arr = temp;
    }

    @Override
    public E getElement() throws Exception {
        return (E)arr[0];
    }

    @Override
    public E dequeue() {
        Object temp = arr[0];
        Object[] temparray = new Object[size-1];
        for (int i = 1; i < size; i++) temparray[i-1] = arr[i];
        arr = temparray;
        size--;
        return (E)temp;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        return size==0;
    }
    @Override
    public void clear() {
        Object[] clear = new Object[0];
        arr = clear;
        size=0;
    }
}
