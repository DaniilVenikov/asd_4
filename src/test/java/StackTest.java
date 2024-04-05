import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StackTest {

    @Test
    public void testSize() {
        Stack<Integer> stack = new Stack<>();
        assertEquals(0, stack.size());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());

        stack.pop();
        assertEquals(2, stack.size());

        stack.pop();
        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    public void testPop() {
        Stack<String> stack = new Stack<>();
        assertNull(stack.pop());

        stack.push("a");
        stack.push("b");
        stack.push("c");
        assertEquals("c", stack.pop());
        assertEquals("b", stack.pop());
        assertEquals("a", stack.pop());
        assertNull(stack.pop());
    }

    @Test
    public void testPush() {
        Stack<Double> stack = new Stack<>();
        stack.push(3.14);
        assertEquals(1, stack.size());
        assertEquals(3.14, stack.peek(), 0.001);

        stack.push(2.718);
        assertEquals(2, stack.size());
        assertEquals(2.718, stack.peek(), 0.001);
    }

    @Test
    public void testPeek() {
        Stack<Character> stack = new Stack<>();
        assertNull(stack.peek());

        stack.push('a');
        assertEquals('a', stack.peek().charValue());

        stack.push('b');
        assertEquals('b', stack.peek().charValue());

        stack.pop();
        assertEquals('a', stack.peek().charValue());
    }
}

