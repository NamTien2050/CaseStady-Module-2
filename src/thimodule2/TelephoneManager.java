package thimodule2;

import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneManager {
    Scanner sc = new Scanner(System.in);
    static ArrayList<TelephoneDirectory> listPhone = new ArrayList<>();
    TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

    public TelephoneManager() {
    }

    public int findByPhoneNumBer(String phoneNumBer) {
        for (int i = 0; i < listPhone.size(); i++) {
            if (listPhone.get(i).getPhoneNumBer().equals(phoneNumBer)) {
                return i;
            }
        }
        return -1;
    }

    public void showPhone() {
        System.out.print("nhập sđt ");
        String phoneNumBer = sc.nextLine();
        while (findByPhoneNumBer(phoneNumBer) == -1) {
            System.out.println("sđt không tồn tại, xin nhập lại");
            phoneNumBer = sc.nextLine();
        }
        System.out.println(listPhone.get(findByPhoneNumBer(phoneNumBer)));
    }

    public void showPhoneList() {
        for (int i = 0; i < listPhone.size(); i++) {
            System.out.println("số điện thoại " + listPhone.get(i).getPhoneNumBer() + "\n" +
                    "Nhóm " + listPhone.get(i).getPhoneBookGroup() + "\n" +
                    "Họ tên " + listPhone.get(i).getLastName() + "\n" +
                    "Giới tính " + listPhone.get(i).getSex() + "\n" +
                    "Địa chỉ " + listPhone.get(i).getAddress() + "\n");
        }
    }

    public void addPhoneNumBer() {
        System.out.print("nhập sđt ");
        String phoneNumBer = sc.nextLine();
        while (findByPhoneNumBer(phoneNumBer) != -1) {
            System.out.println("sđt đã tồn tại, xin nhập lại");
            phoneNumBer = sc.nextLine();
        }
        System.out.print("Nhóm danh bạ ");
        String phoneBookGroup = sc.nextLine();
        System.out.print("Họ Tên ");
        String lastName = sc.nextLine();
        System.out.print("Giới tính ");
        String sex = sc.nextLine();
        System.out.print("Địa chỉ ");
        String address = sc.nextLine();
        System.out.print("Ngày sinh ");
        String dateOfBirth = sc.nextLine();
        System.out.print("Email ");
        String email = sc.nextLine();
        System.out.print("Thêm mới thành công, xin cám ơn");
        listPhone.add(new TelephoneDirectory(phoneNumBer, phoneBookGroup, lastName, sex, address, dateOfBirth, email));
    }

    public void editPhoneNumBer() {
        System.out.print("nhập sđt ");
        String phoneNumBer = sc.nextLine();
        while (findByPhoneNumBer(phoneNumBer) == -1) {
            System.out.println("sđt không tồn tại, xin nhập lại");
            phoneNumBer = sc.nextLine();
        }
        System.out.print("Nhóm danh bạ ");
        String phoneBookGroup = sc.nextLine();
        telephoneDirectory.setPhoneBookGroup(phoneBookGroup);
        System.out.print("Họ Tên ");
        String lastName = sc.nextLine();
        telephoneDirectory.setLastName(lastName);
        System.out.print("Giới tính ");
        String sex = sc.nextLine();
        telephoneDirectory.setSex(sex);
        System.out.print("Địa chỉ ");
        String address = sc.nextLine();
        telephoneDirectory.setAddress(address);
        System.out.print("Ngày sinh ");
        String dateOfBirth = sc.nextLine();
        telephoneDirectory.setDateOfBirth(dateOfBirth);
        System.out.print("Email ");
        String email = sc.nextLine();
        telephoneDirectory.setEmail(email);
        System.out.print("Thay đổi thành công, xin cám ơn");
    }

    public void removePhoneNumBer() {
        System.out.print("nhập sđt ");
        String phoneNumBer = sc.nextLine();
        while (findByPhoneNumBer(phoneNumBer) == -1) {
            System.out.println("sđt không tồn tại, xin nhập lại");
            phoneNumBer = sc.nextLine();
        }
        System.out.println("bạn có chắc muốn xóa" + "\n" + "1.có" + "\n" + "2.không");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                listPhone.remove(listPhone.get(findByPhoneNumBer(phoneNumBer)));
                showPhoneList();
                break;
            case 2:
                break;
        }
    }
    public String getGmail() {
        while (true) {
            try {
                System.out.println("Nhập vào gmail");
                String gmail = sc.nextLine();
                if (GmailRegex.validate(gmail)) {
                    boolean check = true;
                    for (TelephoneDirectory danhBa : listPhone) {
                        if (danhBa.getEmail().equals(gmail)) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        return gmail;
                    } else {
                        System.err.println("Gmail đã tồn tại. Nhập lại gmail");
                    }
                } else throw new Exception();
            } catch (Exception e) {
                System.err.println("Gmail bắt buộc phải là định dạng .....@gmail.com");
            }
        }
    }

}
