package Library_3.Config;

public class Node<Type> {

    private Type elements;
    private Node nextElements;

    public Node(Type elements) {
        this.elements = elements;
    }

    public Type getElements() {
        return elements;
    }

    public void setElements(Type elements) {
        this.elements = elements;
    }

    public Node getNext() {
        return nextElements;
    }

    void setNext(Node elements) {
        nextElements = elements;
    }
}