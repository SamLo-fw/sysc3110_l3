import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addresses;
    public AddressBook(){
        this.addresses = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        this.addresses.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.addresses.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Biden", "The White House", "+1");
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        
        book.removeBuddy(buddy);
    }
}
