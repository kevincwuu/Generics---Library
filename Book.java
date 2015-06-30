package GenericsLibrary;

public class Book extends LibraryItem implements Borrowable {
    int id;
    String desc;
    String bookTitle;
    public Date checkOut, dueDate;

    public Book (int id, String desc, String title, Date d){
        super(id, desc, d);
        this.id = id;
        this.desc = desc;
        bookTitle = title;

    }

    public void setDesc(String s) {
        super.setDescription(s);
    }

    public String getDescription() {
        return super.getDescription();
    }

    public Date getCheckoutData() {
        return checkOut;
    }

    public Date getDueData() {
        return dueDate;
    }

    public void setCheckoutDate(Date d) {
        this.checkOut = d;
    }

    public void setDueData(Date d){
        this.dueDate = d;
    }

    @Override
    public String toString() {
        return "Title: " + bookTitle + " | Description: " + desc;
    }
}
