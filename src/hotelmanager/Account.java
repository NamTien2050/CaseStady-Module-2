package hotelmanager;

public class Account {
    private String useName, password, name, address, phoneNumber, email;
    private int age;

    public Account() {
    }

    public Account(String useName, String password, String name, int age, String address, String phoneNumber, String email) {
        this.useName = useName;
        this.password = password;
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getuseName() {
        return useName;
    }

    public void setuseName(String useName) {
        this.useName = useName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "CustomerInformation{" +
                "useName='" + useName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
