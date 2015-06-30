package GenericsLibrary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LibraryCollection<E> {

    ArrayList<E> collection = new ArrayList<E>();

    public boolean add(E o) {
        if(o == null) {
            return false;
        }
        collection.add(o);
        return true;
    }

    public boolean addAll(Collection<? extends E> c) {
        if (c.isEmpty()) {
            return false;
        }
        for(E iterate : c) {
            collection.add(iterate);
        }
        return true;
    }

    public boolean remove(Object o) {
        if(o != null) {
            collection.remove(o);
            return true;
        }
        return false;
    }

    public E search(E ob) {
        E obj = null;
        for ( E o : collection) {
            if (contains(ob) == true) {
                obj = ob;
                break;
            }
        }
        return obj;
    }

    public void clear() {
        while(getIterator().hasNext()) {
            remove(getIterator().next());
        }
        System.out.println("Library collection is now empty");
    }

    public boolean removeAll(LibraryCollection<?> c) {
        boolean bool = false;
        Iterator cIterator = c.getIterator();
        while(cIterator.hasNext()) {
            Object a = cIterator.next();
            for(int i = 0; i < collection.size(); i++) {
                if(collection.get(i).equals(a)) {
                    System.out.println("Removed the following item " + collection.remove(i));
                    bool = true;
                }
            }
        }
        return bool;
    }

    void printCollection(LibraryCollection<E> c) {
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.collection.get(i));
        }
    }

    public void retainAll(LibraryCollection<?> c) {
        for(int i = 0; i < collection.size(); i++) {
            if(!c.contains(collection.get(i))) {
                remove(collection.get(i));
            }
        }
    }

    public boolean contains(Object o) {
        if(collection.contains(o)) {
            return true;
        }
        return false;
    }

    public boolean containsAll(LibraryCollection<?> c) {

            for(int j = 0; j < c.size(); j++) {
                if(!collection.contains(j)) {
                    return false;
                }
            }
        return true;
    }


    public boolean isEmpty() {
        return collection.isEmpty();
    }

    public int size() {
        return collection.size();
    }

    public Iterator<E> getIterator() {
        Iterator<E> collectionIterator = collection.iterator();
        return collectionIterator;
    }

    public Object[] toArray(LibraryCollection<E> c) {
        E[] mArray = null;
        System.arraycopy(c, 0, mArray, 0, c.size());
        return mArray;
    }

    public <T> T[] toArray(T[] a) {
        T[] mArray = a.clone();
        System.arraycopy(a, 0, mArray, 0, a.length);
        return mArray;
    }

    public boolean isBook(E obj) {
        return (obj instanceof Book);
    }

    public boolean isOverdue(Date d1, Date d2) {
        return (d1.compareTo(d2) < 0);
    }
}
