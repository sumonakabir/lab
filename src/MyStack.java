public class MyStack {

    private int stackPointer = -1;
    private int[] elements = new int[10];

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack empty");
        }
        return elements[stackPointer];
    }

    public void push(int n) {
        stackPointer++;
        elements[stackPointer] = n;
    }

    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack empty");
        }
        stackPointer--;
    }

    public boolean isEmpty() {
        return stackPointer == -1;
    }

    public int getSize() {
        return stackPointer + 1;
    }
}

