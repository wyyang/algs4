/**
 * Created by weiyi_yang on 1/8/17.
 */

import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
    private Node first = null;
    private Node last = null;
    private int deque_size = 0;
    private class Node {
        Item item;
        Node next;
    }

    public Deque()                           // construct an empty deque

    public boolean isEmpty() {                 // is the deque empty?
        return (first == null && last == null);
    }

    public int size() {                       // return the number of items on the deque
        return deque_size;
    }
    public void addFirst(Item item) {          // add the item to the front
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        size++;

    }
    public void addLast(Item item) {           // add the item to the end
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.
    }
    public Item removeFirst()                // remove and return the item from the front

    public Item removeLast()                 // remove and return the item from the end

    public Iterator<Item> iterator()         // return an iterator over items in order from front to end

    public static void main(String[] args)   // unit testing (optional)
}
