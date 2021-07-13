package hotelmanager;

import java.util.ArrayList;
import java.util.Scanner;

class AccountManagement {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Account> accountList = new ArrayList<>();

    public AccountManagement() {
    }

//    static {
//        accountList.add(new Account("0968502733", "Hathininh1995", "Hà Thị Ninh", 25, "Hà Giang", "0968502733", "thininh472@gmail.com"));
//        accountList.add(new Account("0974625200", "Huanhoahong1991", "Huấn Hoa Hồng", 21, "Nam Định", "0974625200", "hoahong204@gmail.com"));
//        accountList.add(new Account("0974392744", "Buiduyhung1996", "Bùi Duy Hưng", 27, "Ninh Bình", "0974392744", "duyhung953@gmail.com"));
//        accountList.add(new Account("0989234719", "Trandieuthuy1989", "Trần Diệu Thúy", 34, "Thái Nguyên", "0989234719", "dieuthuy953@gmail.com"));
//        accountList.add(new Account("0976497107", "Hoangtuankhang1983", "Hoàng Tuấn Khang", 39, "Cà Mau", "0976497107", "tuankhang953@gmail.com"));
//    }

    public int findByUseName(String useName) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getuseName().equals(useName)) {
                return i;
            }
        }
        return -1;
    }

    public int findByPassword(String password) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getPassword().equals(password)) {
                return i;
            }
        }
        return -1;
    }

    public void useNameLogin() {
        System.out.print("Nhập tài khoản (số điện thoại củA bạn): ");
        String account = sc.nextLine();
        while (findByUseName(account) != -1) {
            System.out.print("Use không tồn tại, nhập lại ");
            account = sc.nextLine();
        }
    }

    public void passwordLogin() {
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();
        while (findByPassword(password) != -1) {
            System.out.print("nhập sai mật khẩu, nhập lại ");
            password = sc.nextLine();
        }
    }

    public Account createAccount() {
        System.out.print("Nhập tài khoản: ");
        String useName = sc.nextLine();
        while (findByUseName(useName) != -1) {
            System.out.print("trùng, nhập lại ");
            useName = sc.nextLine();
        }
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();
        System.out.print("Nhập tên:");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Nhập Email: ");
        String email = sc.nextLine();
        System.out.println("Thêm Tk thành công, xin cám ơn");
        return new Account(useName, password, name, age, address, phoneNumber, email);
    }

    public void findByRelative() {
        System.out.print("Nhập tài khoản: ");
        String account = sc.nextLine();
        for (Account a : accountList) {
            if (a.getuseName().contains(account)) {
                System.out.println("Tên KH: " + a.getName() + "\n" +
                        "Tên tài khoản: " + a.getuseName() + "\n" +
                        "Tuổi KH: " + a.getAge() + "\n" +
                        "SĐT KH: " + a.getPhoneNumber());
            }
        }
    }

    public void showAccount() {
        System.out.print("Nhập tài khoản: ");
        String account = sc.nextLine();
        while (findByUseName(account) == -1) {
            System.out.print("Use không tồn tại, nhập lại ");
            account = sc.nextLine();
        }
        System.out.println("Tên KH: " + accountList.get(findByUseName(account)).getName() + "\n" +
                "Tên tài khoản: " + accountList.get(findByUseName(account)).getuseName() + "\n" +
                "Tuổi KH: " + accountList.get(findByUseName(account)).getAge() + "\n" +
                "SĐT KH: " + accountList.get(findByUseName(account)).getPhoneNumber());
    }
}
