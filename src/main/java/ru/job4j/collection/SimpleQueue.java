package ru.job4j.collection;

import java.util.NoSuchElementException;

public class SimpleQueue<T> {
    private final SimpleStack<T> in = new SimpleStack<>();
    private final SimpleStack<T> out = new SimpleStack<>();
    private int inCount;
    private int outCount;

    /* добавьте переменные, если они требуются */

    public T poll() {
        if (inCount == 0 && outCount == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        if (outCount == 0) {
            while (inCount != 0) {
                out.push(in.pop());
                inCount--;
                outCount++;
            }
        }
        outCount--;
        return out.pop();
    }

    public void push(T value) {
        in.push(value);
        inCount++;
    }
}