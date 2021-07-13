package hotelmanager;

import java.util.Scanner;

public class MenuBill {
    public void billManager() {
        Scanner sc = new Scanner(System.in);
        BillManager billManager = new BillManager();
        while (true) {
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            System.out.println("----BILL MENU----");
            System.out.println("Chọn chức năng để tiếp tục");
            System.out.println("1.Danh sách hóa đơn");
            System.out.println("2.Tạo hóa đơn mới");
            System.out.println("3.Thay đổi thông tin hóa đơn");
            System.out.println("0.Quay lại");
            int choose = 100;
            try {
                choose = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (choose == 0)
                return;
            switch (choose) {
                case 1:
                    billManager.showBill();
                    break;
                case 2:
                    billManager.addBill();
                    break;
                case 3:
                    billManager.editBill();
            }
        }
    }
}
