import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    public void testPush() {
        MyStack stack = new MyStack();
        stack.push(5);

        assertEquals(1, stack.getSize());
    }

    @Test
    void testTop() {
        MyStack stack = new MyStack();
        stack.push(10);

        assertEquals(10, stack.top());
    }

    @Test
    void testPop() {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    void testIsEmpty() {
        MyStack stack = new MyStack();

        assertTrue(stack.isEmpty());
    }

    @Test
    void testGetSize() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.getSize());
    }

    @Test
    void testPopEmptyStack() {
        MyStack stack = new MyStack();

        assertThrows(RuntimeException.class, () -> stack.pop());
    }

    @Test
    void testTopEmptyStack() {
        MyStack stack = new MyStack();

        assertThrows(RuntimeException.class, () -> stack.top());
    }
}
