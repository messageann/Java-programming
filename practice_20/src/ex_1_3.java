import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ex_1_3 <E> {
    public E[] data;
    private ArrayList<E> l = new ArrayList();

    public ex_1_3(E[] data) {
            this.data = data;
    }

    public E getElement(int index){
        return data[index];
    }

    public ArrayList<E> Convertor(E[] array) {
        l.addAll(Arrays.asList(array));
        return l;
    }
}
