package RequiredTasks.OOP.Task1;

import java.util.*;
import java.util.function.Consumer;

public class SomeClass<T> implements List<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    /**
     * link specified element to end of list
     */
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

    /**
     * link node with specified element before specified node.
     */
    private void linkBefore(T e, Node<T> node) {
        final Node<T> prev = node.previous;
        final Node<T> newNode = new Node<>(node.previous, e, node);
        node.previous = newNode;
        if (prev == null) {
            first = newNode;
        } else {
            prev.next = newNode;
        }
        size++;
    }

    private void linkAfter(T e, Node<T> node) {
        final Node<T> next = node.next;
        final Node<T> newNode = new Node<>(node, e, node.next);
        node.next = newNode;
        if (next == null) {
            last = newNode;
        } else {
            next.next = newNode;
        }
        size++;
    }

    /**
     * unlink specified node and link prev + next
     */
    private T unlinkNode(Node<T> node) {
        final Node<T> next = node.next;
        final Node<T> prev = node.previous;
        final T element = node.element;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            node.previous = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.previous = prev;
            node.next = null;
        }
        node.element = null;
        size--;
        return element;
    }

    /**
     * Return node at specified index.
     */
    private Node<T> node(int index) {
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
        return new Iterator<>() {
            private Node<T> i = first;

            @Override
            public boolean hasNext() {
                return i != null;
            }

            @Override
            public T next() {
                final Node<T> answ = i;
                i = i.next;
                return answ.element;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size];
        for (int i = 0; i < size; i++) {
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

    /**
     * remove first occurrence of specified object.
     */
    @Override
    public boolean remove(Object o) {
        // if we search null object
        if (o == null) {
            for (Node<T> x = first; x != null; x = x.next) {
                if (x.element == null) {
                    unlinkNode(x);
                    return true;
                }
            }
            // if we search not null object
        } else {
            for (Node<T> x = first; x != null; x = x.next) {
                if (o.equals(x.element)) {
                    unlinkNode(x);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (var now : c) {
            if (!this.contains(now))
                return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (var now : c) {
            this.add(now);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        for (var now : c) {
            this.add(index, now);
            index++;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object now : c) {
            while (this.contains(now)) {
                this.remove(now);
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        for (var obj : this) { // go for all elements
            if (!c.contains(obj)) // if c not contains obj
                this.remove(obj); // delete obj in our List
        }
        return true;
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
        return node(index).element;
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
        return unlinkNode(node(index));
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        // if we search null object
        if (o == null) {
            for (Node<T> x = first; x != null; x = x.next) {
                if (x.element == null)
                    return index;
                index++;
            }
            // if we search not null object
        } else {
            for (Node<T> x = first; x != null; x = x.next) {
                if (o.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        // Search begins in the end of the list
        int index = size;
        // null search
        if (o == null) {
            for (Node<T> x = last; x != null; x = x.previous) {
                index--;
                if (x.element == null)
                    return index;
            }
            // not null search
        } else {
            for (Node<T> x = last; x != null; x = x.previous) {
                index--;
                if (o.equals(x.element))
                    return index;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        return new ListIterator<T>() {
            private int nextIndex = 0;
            private Node<T> next = node(nextIndex);
            private Node<T> lastReturned = null; // last returned

            public boolean hasNext() {
                return nextIndex < size;
            }

            public T next() {
                lastReturned = next;
                next = next.next;
                nextIndex++;
                return lastReturned.element;
            }

            public boolean hasPrevious() {
                return nextIndex > 0;
            }

            public T previous() {
                lastReturned = next = (next == null) ? last : next.previous;
                nextIndex--;
                return lastReturned.element;
            }

            public int nextIndex() {
                return nextIndex;
            }

            public int previousIndex() {
                return nextIndex - 1;
            }

            public void remove() {
                Node<T> lastNext = lastReturned.next;
                unlinkNode(lastReturned);
                if (next == lastReturned)
                    next = lastNext;
                else
                    nextIndex--;
                lastReturned = null;
            }

            public void set(T e) {
                lastReturned.element = e;
            }

            public void add(T e) {
                lastReturned = null;
                if (next == null)
                    linkLast(e);
                else
                    linkBefore(e, next);
                nextIndex++;
            }
        };
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return new ListIterator<T>() {

            private int nextIndex = index;
            private Node<T> next = (index == size) ? null : node(index);
            private Node<T> lastReturned = null; // last returned

            public boolean hasNext() {
                return nextIndex < size;
            }

            public T next() {
                lastReturned = next;
                next = next.next;
                nextIndex++;
                return lastReturned.element;
            }

            public boolean hasPrevious() {
                return nextIndex > 0;
            }

            public T previous() {
                lastReturned = next = (next == null) ? last : next.previous;
                nextIndex--;
                return lastReturned.element;
            }

            public int nextIndex() {
                return nextIndex;
            }

            public int previousIndex() {
                return nextIndex - 1;
            }

            public void remove() {
                Node<T> lastNext = lastReturned.next;
                unlinkNode(lastReturned);
                if (next == lastReturned)
                    next = lastNext;
                else
                    nextIndex--;
                lastReturned = null;
            }

            public void set(T e) {
                lastReturned.element = e;
            }

            public void add(T e) {
                lastReturned = null;
                if (next == null)
                    linkLast(e);
                else
                    linkBefore(e, next);
                nextIndex++;
            }
        };
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        final List<T> sub = new SomeClass<>();
        for (int i = fromIndex; i < toIndex; i++) {
            sub.add(node(i).element);
        }
        return sub;
    }
}