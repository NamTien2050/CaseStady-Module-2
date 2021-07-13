package hotelmanager;

import java.text.NumberFormat;
import java.util.Scanner;

public class MenuHotel {
    public void hotelManager() {
        Scanner sc = new Scanner(System.in);
        AccountManagement accountManagement = new AccountManagement();
        MenuRoom menuRoom = new MenuRoom();
        MenuBill menuBill= new MenuBill();
        BillManager billManager = new BillManager();
        while (true) {
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            System.out.println("----RESORT HANOI MENU----");
            System.out.println("Chọn chức năng để tiếp tục");
            System.out.println("1. Xem Thông tin tài khoản");
            System.out.println("2. quản lý phòng");
            System.out.println("3. quản lý hóa đơn");
            System.out.println("4. thống kê doanh thu");
            System.out.println("0. Quay lại" );
            int choose = Integer.parseInt(sc.nextLine());
            if (choose == 0)
                return;
            switch (choose) {
                case 1:
                    accountManagement.findByRelative();
                    break;
                case 2:
                    menuRoom.roomManager();
                    break;
                case 3:
                    menuBill.billManager();
                    break;
                case 4:
                    System.out.print("nhập phòng xuất hóa đơn ");
                    String roomBill= sc.nextLine();
                    billManager.totalBill(roomBill);
            }
        }
//roomManager.addRoom();
//roomManager.editRoom();
//accountManagement.disPlayAccount();


    }
}
