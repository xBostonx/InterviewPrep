package ru.geekbrains;

import ru.geekbrains.util.MyArrayListOutOfBoundsException;
import ru.geekbrains.util.NonExistsObjectException;

import java.util.Arrays;

public class MyArrayList {
    private final static int startMaxCapacity = 2;
    private final static int startCurrentSize = 0;

    private Object[] array;

    private int currentSize = startCurrentSize;
    private int maxCapacity = startMaxCapacity;

    public MyArrayList() {
        this.array = new Object[startMaxCapacity];
    }

    public void add(Object object) {
        if (!isNotFull()) {
            array = copyAndIncreaseCapacity();
        }
        array[currentSize++] = object;
    }

    public Object get(int index) {
        if (index >= currentSize) {
            throw new MyArrayListOutOfBoundsException();
        }
        return array[index];
    }

    public void remove(int index) {
        Object[] exArray = new Object[size() - 1];
        int indexNew = 0;
        int indexOld = 0;
        while (indexNew != index) {
            exArray[indexNew] = array[indexOld];
            indexNew++;
            indexOld++;
        }
        indexOld++;
        for (; indexNew < currentSize - 1; indexNew++) {
            exArray[indexNew] = array[indexOld];
        }
        array = exArray;
        currentSize--;
    }

    public int indexOf(Object target) {
        for (int i = 0; i < currentSize; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        throw new NonExistsObjectException();
    }

    public int size() {
        return currentSize;
    }

    public void clear() {
        currentSize = startCurrentSize;
        maxCapacity = startMaxCapacity;
        array = new Object[maxCapacity];
    }

    public boolean contains(Object target) {
        for (Object object : array) {
            if (target.equals(object)) {
                return true;
            }
        }
        return false;
    }

    private boolean isNotFull() {
        return maxCapacity / 1.5 > currentSize;
    }

    private Object[] copyAndIncreaseCapacity() {
        maxCapacity = (maxCapacity * 2);
        return Arrays.copyOf(array, maxCapacity);
    }
}
