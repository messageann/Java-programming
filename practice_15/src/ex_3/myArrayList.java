package ex_3;

import java.util.Arrays;

public class myArrayList<Template> {
    private Object[] arr;
    private int size = 0;

    public myArrayList() {
        arr = new Object[0];
    }

    public myArrayList(int s) {
        arr = new Object[s];
        size = s;
    }

    public void add(Template e) {
        size++;
        Object[] temp = new Object[size];
        for (int i = 0; i < size-1; i++) temp[i] = arr[i];
        temp[size-1] = e;
        arr = temp;
    }

    public void add(int index, Template e) {
        int i = 0;
        size++;
        Object[] temp = new Object[size];
        for (; i < index; i++) temp[i] = arr[i];
        temp[index] = e;
        for (i++; i<size; i++) temp[i] = arr[i-1];
        arr = temp;
    }

    public void clear() {
        Object[] temp = new Object[0];
        arr = temp;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void set(int index, Template e) {
        arr[index] = e;
    }

    public boolean contains (Template e) {
        for (int i = 0; i<size; i++) {
            if (arr[i] == e) return true;
        }
        return false;
    }

    public myArrayList clone() {
        myArrayList<String> temp = new myArrayList<String>();
        temp.size = this.size;
        temp.arr = this.arr;
        return temp;
    }

    public Object get(int index) {
        return arr[index];
    }

    public int indexOf(Template e) {
        for (int i = 0; i<size; i++) {
            if (arr[i] == e) return i;
        }
        return -1;
    }

    public int lastIndexOf(Template e) {
        int res = -1;
        for (int i = 0; i<size; i++) {
            if (arr[i] == e) res = i;
        }
        return res;
    }

    public void remove (int index) {
        int i = 0;
        size--;
        Object[] temp = new Object[size];
        for (; i < index; i++) temp[i] = arr[i];
        for (i++; i<size+1; i++) temp[i-1] = arr[i];
        arr = temp;
    }

    public void remove (Template e) {
        int i = 0;
        size--;
        Object[] temp = new Object[size];
        for (; i<size && arr[i] != e; i++) temp[i] = arr[i];
        for (i++; i<size+1; i++) temp[i-1] = arr[i];
        arr = temp;
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder st = new StringBuilder();
        st.append('[');
        int i = 0;
        for(;i<size-1;i++) {
            st.append(arr[i]);
            st.append(", ");
        }
        st.append(arr[i]);
        st.append(']');
        return st.toString();
    }
}
