package hotelmanager;

import java.util.Scanner;

public class MenuRoom {
    public void roomManager() {
        Scanner sc = new Scanner(System.in);
        RoomManager roomManage = new RoomManager();
        while (true) {
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            System.out.println("----ROOM MENU----");
            System.out.println("Chọn chức năng để tiếp tục");
            System.out.println("1.Danh sách các phòng");
            System.out.println("2.Tìm kiếm phòng theo giá");
            System.out.println("3.Kiểm tra phòng");
            System.out.println("4.Tạo phòng mới");
            System.out.println("5.Thay đổi thông tin phòng ");
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
                    roomManage.showRoom();
                    break;
                case 2:
                    roomManage.showPriceByRoom();
                    break;
                case 3:
                    roomManage.roomChecking();
                    break;
                case 4:
                    roomManage.addRoom();
                    break;
                case 5:
                    roomManage.editRoom();
                    break;
            }
        }
    }
}
