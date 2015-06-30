package GenericsLibrary;

public interface Borrowable {

    Date getCheckoutData();

    Date getDueData();

    void setCheckoutDate(Date d);

    void setDueData(Date d);

}
