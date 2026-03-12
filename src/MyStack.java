import java.util.ArrayList;

public class MyStack {

    private ArrayList<Integer> elements = new ArrayList<>();

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack empty");
        }
        return elements.get(elements.size() - 1);
    }

    public void push(int n) {
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
