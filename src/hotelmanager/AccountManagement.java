package hotelmanager;

import java.util.ArrayList;
import java.util.Scanner;

class AccountManagement {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Account> list = new ArrayList<>();

    public AccountManagement() {
        listAccount();
    }

    public void listAccount() {
        list.add(new Account("0968502733", "Nenthihue1995", "Huê", 25, "0968502733", "Hà Giang", "nenhue472@gmail.com"));
        list.add(new Account("0974625200", "Ngobason1991", "Huê", 21, "0974625200", "Nam Định", "bason204@gmail.com"));
        list.add(new Account("0974392744", "Buiduyhung1996", "Huê", 27, "0974392744", "Ninh Bình", "duyhung953@gmail.com"));
    }

    public int findByUseName(String account) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAccount().equals(account)) {
                return i;
            }
        }
        return -1;
    }

    public Account createAccount() {
        System.out.print("Nhập tài khoản: ");
        String account = sc.nextLine();
        while (findByUseName(account) != -1) {
            System.out.print("trùng, nhập lại ");
            account = sc.nextLine();
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
        return new Account(account, password, name, age, address, phoneNumber, email);
    }

    public void disPlayAccount(){
        System.out.print("Nhập tài khoản: ");
        String account = sc.nextLine();
        while (findByUseName(account) == -1) {
            System.out.print("Use không tồn tại, nhập lại ");
            account = sc.nextLine();
        }

    }
}
