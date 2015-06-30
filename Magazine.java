package GenericsLibrary;

public class Magazine extends LibraryItem{
    int id;
    String desc;
    Date checkOut, dueDate;


    public Magazine (int id, String desc, Date d){
        super(id, desc, d);
        this.id = id;
        this.desc = desc;

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
        return "Title: " + desc + " id";
    }
}
