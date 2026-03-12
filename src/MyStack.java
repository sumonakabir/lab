import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> elements = new ArrayList<>();

    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack empty");
        }
        return elements.get(elements.size() - 1);
    }

    public void push(T n) {
        elements.add(n);
    }

    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack empty");
        }
        elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int getSize() {
        return elements.size();
    }
}
