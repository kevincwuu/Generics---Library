package GenericsLibrary;

public interface Iterator<E> {
    E getNext();   // Get the next element, null if none
    boolean hasNext();  // True if more elements, false if no more
    boolean isEmpty();  // True if no elements are present, false otherwise
}
