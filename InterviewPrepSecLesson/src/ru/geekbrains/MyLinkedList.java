package ru.geekbrains;

public class MyLinkedList<T> {
    private final static int startMaxCapacity = 2;
    private final static int startCurrentSize = 0;

    private LinkedElement[] array;

    private int currentSize = startCurrentSize;
    private int maxCapacity = startMaxCapacity;

    public MyLinkedList(LinkedElement[] array) {
        this.array = new LinkedElement[startMaxCapacity];
    }

    public void add(Object object) {
        if (currentSize==0) {
            array[currentSize].previousElement = null;
        } else {
            array[currentSize].previousElement = array[currentSize-1];
        }
        array[currentSize].element = object;
    }
}
