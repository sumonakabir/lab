
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    void testPush() {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);

        assertEquals(1, stack.getSize());
    }

    @Test
    void testTop() {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(20);

        assertEquals(20, stack.top());
    }

    @Test
    void testPop() {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(30);
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    void testIsEmpty() {
        MyStack<Integer> stack = new MyStack<>();

        assertTrue(stack.isEmpty());
    }

    @Test
    void testGetSize() {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.getSize());
    }

    @Test
    void testTopOnEmptyStack() {
        MyStack<Integer> stack = new MyStack<>();

        assertThrows(RuntimeException.class, () -> stack.top());
    }

    @Test
    void testPopOnEmptyStack() {
        MyStack<Integer> stack = new MyStack<>();

        assertThrows(RuntimeException.class, () -> stack.pop());
    }

    @Test
    void testGenericStringStack() {
        MyStack<String> stack = new MyStack<>();

        stack.push("DIU");

        assertEquals("DIU", stack.top());
    }
}