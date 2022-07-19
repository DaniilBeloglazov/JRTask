package RequiredTasks.OOP.Task1;

class Node <T>{
    T element;
    Node<T> next;
    Node<T> previous;
    Node(Node<T> previous, T element, Node<T> next){
        this.element = element;
        this.next = next;
        this.previous = previous;
    }
}
