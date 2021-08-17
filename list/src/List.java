import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.Arrays;

class List<E> {
    private final int DEFAULT_LENGTH = 10;
    private int size = 0;
    private Object[] element;

    public List() {
        element = new Object[DEFAULT_LENGTH];
    }

    public void newLength() {
        element = Arrays.copyOf(element, element.length * 2);
    }

    public int getSize() {
        return size;
    }

    public E getElement(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("size = " + size + " , " + "index = " + index);
        }
        return (E) element[index];
    }

    public void add(E e) {
        if (size == DEFAULT_LENGTH) {
            newLength();
        }
        element[size] = e;
        size++;
    }

    public void add(E e, int index) {
        if (size == DEFAULT_LENGTH) {
            newLength();
        }
        Object[] newElements = new Object[size + 1];
        for (int i = 0; i < newElements.length; i++) {
            if (i < index) {
                newElements[i] = element[i];
            } else if (i == index) {
                newElements[i] = e;
            } else {
                newElements[i] = element[i - 1];
            }
        }
        element = newElements;
        size++;
    }

}