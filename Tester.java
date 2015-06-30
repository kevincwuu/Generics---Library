package GenericsLibrary;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        LibraryCollection libcol = new LibraryCollection();
        LibraryCollection libcol2 = new LibraryCollection();
       CheckoutCart cart = new CheckoutCart();

        Date d1 = new Date(2015, 05, 03);
        Book book1 = new Book(2, "Enchanting novel about a young Wizard", "Harry Potter by J.K. Rowling", d1);

        Date d2 = new Date(2015, 05, 04);
        Book book2 = new Book(5, "A vivid roaring dissent", "The Circle by Dave Eggers", d2);

        Date d3 = new Date(2015, 05, 15);
        Book book3 = new Book(10, "Harsh words spoken of the greatest among intellecutal leaders", "The Open Society and Its Enemies by Karl R. Popper", d3);

        Date d4 = new Date(2015, 05, 23);
        Book book4 = new Book(15, "Fantasy world with polar bears, yay", "Cloud Atlas by David Mitchell", d4);

        Date d5 = new Date(2015, 05, 15);
        Date d6 = new Date(2015, 06, 12);

        DVD dvd1 = new DVD(22, "The MazeRunner", d5);
        DVD dvd2 = new DVD(24, "Avengers", d6);

        book1.setDueData(d1);
        book2.setDueData(d2);
        book3.setDueData(d3);
        book4.setDueData(d4);

        // #1 Add
        System.out.println("Case #1: After Running Add:");
        libcol.add(book1);
        libcol.add(book2);
        libcol.add(book3);
        libcol.add(book4);
        libcol.printCollection(libcol);
        System.out.println(" ");

        ArrayList<DVD> dvdArr = new ArrayList<DVD>();
        dvdArr.add(dvd1);
        dvdArr.add(dvd2);

        // #2 AddAll
        System.out.println("Case #2: After Running AddAll:");
        libcol.addAll(dvdArr);
        libcol.printCollection(libcol);
        System.out.println(" ");

        // #3 remove
        System.out.println("Case #3: After Running remove on the DVD 'The MazeRunner' :");
        libcol.remove(dvd1);
        libcol.printCollection(libcol);
        System.out.println(" ");


        // #4 clear
        System.out.println("Case #4: After Running clear() :");
        libcol.clear();
        libcol.printCollection(libcol);
        System.out.println(" ");

        // adding back all Library items
        libcol.add(book1);
        libcol.add(book2);
        libcol.add(book3);
        libcol.add(book4);
        libcol.addAll(dvdArr);
        libcol.printCollection(libcol);
        System.out.println(" ");

        // #5 removeAll
        System.out.println("Case #5: After calling removeAll (DVDs):");
        libcol2.addAll(dvdArr);
        libcol.removeAll(libcol2);
        libcol.printCollection(libcol);
        System.out.println(" ");


        // #6 retainAll
        System.out.println("Case #6: After calling retainAll (DVDs):");
        libcol2.printCollection(libcol2);
        libcol.retainAll(libcol2);
        libcol.printCollection(libcol);
        libcol.clear();
        System.out.println(" ");

        Date overDue = new Date(2015, 05, 21);
        //System.out.println(d2.compareTo(overDue));

        // adding back all Library items
        libcol.add(book1);
        libcol.add(book2);
        libcol.add(book3);
        libcol.add(book4);
        libcol.addAll(dvdArr);
        libcol.printCollection(libcol);

        System.out.println("Books that are overdue: ");
        cart.getOverDueBooks(LibraryCollection.class, 5, overDue, libcol);
    }
}
