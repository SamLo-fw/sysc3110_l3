//class file path is "C:\Users\samlo\Desktop\3rd yr\SYSC 3110\Lab 1\out\production\Lab 1\BuddyInfo.class"
public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(){
        this("John Arbuckle", "711 Maple St.", "(1) 852-192-8894");
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();

        System.out.printf("Hello %s.", buddy.getName());
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }
}
