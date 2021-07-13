package thimodule2;

public class TelephoneDirectory {
    private String phoneNumBer, phoneBookGroup, lastName, sex, address, dateOfBirth, email;

    public TelephoneDirectory() {
    }

    public String getPhoneNumBer() {
        return phoneNumBer;
    }

    public void setPhoneNumBer(String phoneNumBer) {
        this.phoneNumBer = phoneNumBer;
    }

    public String getPhoneBookGroup() {
        return phoneBookGroup;
    }

    public void setPhoneBookGroup(String phoneBookGroup) {
        this.phoneBookGroup = phoneBookGroup;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TelephoneDirectory(String phoneNumBer, String phoneBookGroup, String lastName, String sex, String address, String dateOfBirth, String email) {
        this.phoneNumBer = phoneNumBer;
        this.phoneBookGroup = phoneBookGroup;
        this.lastName = lastName;
        this.sex = sex;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;

    }

    @Override
    public String toString() {
        return "TelephoneDirectory{" +
                "phoneNumBer='" + phoneNumBer + '\'' +
                ", PhoneBookGroup='" + phoneBookGroup + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
