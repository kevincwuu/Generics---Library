package GenericsLibrary;

public class LibraryItem {
    int uniqueID;
    String desc;
    Date d;

    public LibraryItem (int id, String desc, Date d) {
        this.uniqueID = id;
        this.desc = desc;
        this.d = d;
    }

    public void setDescription(String str) {
        this.desc = str;
    }

    public String getDescription() {
        return this.desc;
    }

    public Date getD() {
        return d;
    }

    @Override
    public String toString() {
        return ("Title: " + desc + " ID: " + uniqueID + " Due Date: " + d);
    }
}
