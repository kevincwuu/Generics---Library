package GenericsLibrary;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;

public class CheckoutCart<E extends Borrowable> extends LibraryCollection<E> {

    public Iterator<E> getDueDateIterator (){
        Iterator<E> collectionIterator = collection.iterator();
        return collectionIterator;
    }

    public <E> E[] getOverDueBooks(Class<E> clazz, int size, Date d, LibraryCollection<E> libcol) {
        @SuppressWarnings("unchecked")
        E[] arr = (E[]) Array.newInstance(clazz, size);
        int counter = 0;
        int counter2 = 0;
        Iterator obj = libcol.getIterator();
        while(obj.hasNext() && counter <= libcol.size()) {
            E item = (E)obj.next();
            if(libcol.isBook(item) && ((Book) item).dueDate.compareTo(d) < 0) {
                System.out.println(item);
                try{
                    arr[counter2] = item;
                    counter2++;
                } catch (ArrayStoreException e) {

                }
            }
            counter++;
        }
        return arr;
    }
}
