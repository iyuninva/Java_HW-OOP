package Library_3.Config;

import java.util.Iterator;

public class MyLinkedList<Type> implements Iterable {

    private int size = 0;
    private Node firstElements;
    private Node lastElements;

    public void add(Type data) {
        Node currentElements = new Node(data);
        size++;
        if (firstElements == null) {
            firstElements = currentElements;
            lastElements = currentElements;
            return;
        } else if (lastElements == null) {
            lastElements = currentElements;
            return;
        }

        lastElements.setNext(currentElements);
        lastElements = currentElements;
    }

    public Type getElement(int index) {
        Node currentElements = returnElement(index);
        return (Type) currentElements.getElements();
    }

    private Node returnElement(int index) {
        Node result = firstElements;
        for (int i = 1; i <= index; i++) {
            result = result.getNext();
        }
        return result;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<Type> iterator() {
        return new Iterator<Type>() {
            Node setElement = new Node("0");
            {
                setElement.setNext(firstElements);
            }
            Node currentElement = setElement;

            @Override
            public boolean hasNext() {
                return currentElement.getNext() != null;
            }

            @Override
            public Type next() {
                currentElement = currentElement.getNext();
                return (Type) currentElement.getElements();
            }
        };
    }
}
