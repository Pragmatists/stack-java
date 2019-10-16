package pl.pragmatists.stack;

public class Stack {

    private int size = 0;
    private String[] elements = new String[99];

    public int size() {
        return size;
    }

    public void push(String element) {
        this.elements[size++] = element;
    }

    public String pop() {
        if (stackIsEmpty()) {
            throw new StackEmptyException();
        }
        return elements[--size];
    }

    private boolean stackIsEmpty() {
        return size == 0;
    }
}
