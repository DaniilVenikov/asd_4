import java.util.*;

public class Stack<T>
{
    private final LinkedList<T> linkedList;

    public Stack()
    {
        linkedList = new LinkedList<>();
    }

    public int size()
    {
        return linkedList.size();
    }

    public T pop()
    {
        return linkedList.isEmpty() ? null : linkedList.removeFirst();
    }

    public void push(T val)
    {
        linkedList.addFirst(val);
    }

    public T peek()
    {
        return linkedList.isEmpty() ? null : linkedList.getFirst();
    }
}
