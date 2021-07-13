package thimodule2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TelephoneManager telephoneManager = new TelephoneManager();
        WriteReadphone writeReadphone = new WriteReadphone();
        writeReadphone.readPhoneList();
        while (true) {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
            System.out.println("chọn chức năng theo số để tiếp tục");
            System.out.println("1.Xem danh sách ");
            System.out.println("2.Thêm mới ");
            System.out.println("3.Cập nhập ");
            System.out.println("4.Xóa ");
            System.out.println("5.Tìm kiếm ");
            System.out.println("6.Đọc từ file ");
            System.out.println("7.Ghi vào file ");
            System.out.println("8.Thoát ");
            System.out.print("Chọn chức năng: ");
            int choose = -1;
            try {
                choose = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choose) {
                case 1:
                    telephoneManager.showPhoneList();
                    break;
                case 2:
                    telephoneManager.addPhoneNumBer();
                    telephoneManager.showPhoneList();
                    break;
                case 3:
                    telephoneManager.editPhoneNumBer();
                    telephoneManager.showPhoneList();
                    break;
                case 4:
                    telephoneManager.removePhoneNumBer();
                    telephoneManager.showPhoneList();
                    break;
                case 5:
                    telephoneManager.showPhone();
                    break;
                case 6:
                    writeReadphone.readPhoneList();
                    telephoneManager.showPhoneList();
                    break;
                case 7:
                    WriteReadphone.writePhoneList();
                    break;
                case 8:
                    System.exit(0);
            }

        }
    }
}
