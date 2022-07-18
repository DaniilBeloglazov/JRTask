package RequiredTasks.OOP.Task1;

import java.util.*;

public class SomeClass<T> implements List<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    private void linkLast(T e) {
        final Node<T> l = last; // link on old last
        final Node<T> newNode = new Node<>(l, e, null); // creating new Node for link
        last = newNode; // mark newNode as Last
        if (l == null) // if List was empty
            first = newNode;
        else // else change .next int old last
            l.next = newNode;
        size++;
    }
    private void linkBefore(T e, Node<T> node){
        final Node<T> newNode = new Node<>(node.previous, e, node);
        if (node.previous != null)
            node.previous.next = newNode;
        node.previous = newNode;
        size++;
    }

    private void deleteNode(Node<T> node){
        if (size == 1){
            first = null;
            last = null;
        }
        if (node.previous != null)
            node.previous.next = node.next;
        if (node.next != null)
            node.next.previous = node.previous;
        node = null;
        size--;
    }

    Node<T> node(int index) {
        if (index < (size >> 1)) { // equal div 2
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<T> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.previous;
            return x;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                var answ = get(index);
                index++;
                return answ;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size];
        for (int i = 0; i < size; i++){
            arr[i] = get(i);
        }
        return arr;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        linkLast(t);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<T> current = this.first;
        while (current != null) {
            if (o.equals(current.element)) {
                deleteNode(current);
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for (Node<T> x = first; x != null; ) {
            Node<T> next = x.next;
            x.element = null;
            x.next = null;
            x.previous = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        Node<T> x = node(index);
        return x.element;
    }

    @Override
    public T set(int index, T element) {
        Node<T> x = node(index);
        T oldVal = x.element;
        x.element = element;
        return oldVal;
    }

    @Override
    public void add(int index, T element) {
        if (index == size)
            linkLast(element);
        else
            linkBefore(element, node(index));
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}