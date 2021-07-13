package hotelmanager;

import java.util.Scanner;

public class HotelLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuHotel menuHotel= new MenuHotel();
        ReadWriteAccount readWriteAccount= new ReadWriteAccount();
        AccountManagement accountMa = new AccountManagement();
        readWriteAccount.readAccount();
        while (true) {
            try {
                System.out.println("----webcome to Resort Hanoi----");
                System.out.println("1.Đăng nhập ");
                System.out.println("2.Đăng ký tài khoản ");
                int choose = 100;
                try {
                    choose = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                switch (choose) {
                    case 1:
                        System.out.print("Nhập Tk: ");
                        String useName = sc.nextLine();
                        System.out.print("Nhập Mk: ");
                        String password = sc.nextLine();
                        while (accountMa.findByUseName(useName) == -1 && accountMa.findByPassword(password) == -1) {
                            System.out.println("Nhập sai Tk hoặc Mk, mời nhập lại");
                            System.out.print("Nhập Tk: ");
                            useName = sc.nextLine();
                            System.out.print("Nhập Mk: ");
                            password = sc.nextLine();
                        }
                        menuHotel.hotelManager();

                        break;
                    case 2:
                        System.out.println(" --TẠO TÀI KHOẢN MỚI--" + "\n" + "nhanh chóng và dễ dàng" + "\n");
                        accountMa.createAccount();
                        System.out.println("Đăng nhập lại để sử dụng");
                        break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
