package com.hw2;

import java.util.Arrays;

public class ArrayList<E extends Comparable<? super E>> implements Cloneable, Array<E> {

    private static final int DEFAULT_CAPACITY = 8;

    protected E[] data;
    protected int size;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int initialCapacity) {
        this.data = (E[]) new Comparable[initialCapacity];
    }

    @Override
    public void add(E value) {
        checkAndGrow();
        data[size++] = value;
    }

    @Override
    public void insert(E value, int index) {
        doInsert(value, index);
    }

    protected void doInsert(E value, int index) {
        checkAndGrow();
        if (index == size) {
            add(value);
        }
        else {
            checkIndex(index);
            if (size - index >= 0)  {
                System.arraycopy(data, index, data, index + 1, size - index);
            }
            data[index] = value;
            size++;
        }
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    @Override
    public boolean remove(E value) {
        int index = indexOf(value);
        return index != -1 && (remove(index) != null);
    }

    @Override
    public E remove(int index) {
        checkIndex(index);

        E removedValue = data[index];
        if (size - 1 - index >= 0) {
            System.arraycopy(data, index + 1, data, index, size - 1 - index);
        }

        data[size - 1] = null;
        size--;
        return removedValue;
    }

    @Override
    public int indexOf(E value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(data[i]);
            sb.append(", ");
        }
        if (size > 0) {
            sb.append(data[size - 1]);
        }
        sb.append("]");
        return sb.toString();
    }

    private void swap(int indexA, int indexB) {
        E temp = data[indexA];
        data[indexA] = data[indexB];
        data[indexB] = temp;
    }


    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new MyCustomArrayIndexOutOfBoundsException(index, size);
        }
    }

    protected void checkAndGrow() {
        if (data.length == size) {
            data = Arrays.copyOf(data, calculateNewLength());
        }
    }

    private int calculateNewLength() {
        return size > 0 ? size * 2 : 1;
    }

    @Override
    public E[] toArray() {
        return data;
    }

    @Override
    public Array<E> copy() {
        ArrayList<E> array = new ArrayList<>(size);
        array.size = size;
        array.data = Arrays.copyOf(this.data, size);
        return array;
    }

    @Override
    protected ArrayList<E> clone() throws CloneNotSupportedException {
        return (ArrayList<E>) super.clone();
    }
}
