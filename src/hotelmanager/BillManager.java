package hotelmanager;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

import static java.time.LocalDate.parse;

public class BillManager {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Bill> billList = new ArrayList<>();
    RoomManager roomManager = new RoomManager();
    Bill bill = new Bill();

    public BillManager() {
    }

    static {
        billList.add(new Bill(78, "134C", "Bùi Duy Hưng", "Lương công thành", LocalDate.of(2020, 7, 24), LocalDate.of(2020, 7, 30)));
        billList.add(new Bill(84, "134A", "Huấn Hoa Hồng", "Trần Thanh Luân", LocalDate.of(2020, 6, 30), LocalDate.of(2020, 7, 3)));
        billList.add(new Bill(35, "176A", "Hà Thị Ninh", "Hoàng Văn Thanh", LocalDate.of(2020, 7, 1), LocalDate.of(2020, 7, 7)));
        billList.add(new Bill(59, "134B", "Trần Diệu Thúy", "Cao Văn Trí", LocalDate.of(2020, 5, 14), LocalDate.of(2020, 7, 20)));
        billList.add(new Bill(84, "176C", "Hoàng Tuấn Khang", "Lê Thanh Cao", LocalDate.of(2020, 5, 21), LocalDate.of(2020, 7, 27)));
    }

    public int findById(int id) {
        for (int i = 0; i < billList.size(); i++) {
            if (billList.get(i).getIdBill() == id)
                return i;
        }
        return -1;
    }

    public Double calTotalPayment(String billName) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        Double totalPayment = null;
        for (int i = 0; i < billList.size(); i++) {
            Bill bill = billList.get(i);
            if (bill.getRoomName().equals(billName)) {
                final LocalDate firstDate = bill.getStartDay();
                final LocalDate secondDate = bill.getEndDay();
                final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
                totalPayment = days
                        * roomManager.getPriceByRoom(bill.getRoomName());
                return totalPayment;
            }
        }
        return null;
    }

    public void totalBill(String roomBill) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println(formatter.format(calTotalPayment(roomBill)));
    }

    public void showBill() {
        for (Bill b : billList) {
            System.out.println("Tên phòng " + b.getRoomName() + "\n" +
                    "Tên người thuê " + b.getCustomerName() + "\n" +
                    "Tên NV cho thuê " + b.getReservationStaffName() + "\n" +
                    "Ngày đặt phòng " + b.getStartDay() + "\n" +
                    "ngày trả phòng " + b.getEndDay() + "\n");
//                    "Tổng tiền " + totalBill(b.getRoomName();
        }
    }

    public void addBill() {
        System.out.print("Nhập id ");
        int id = Integer.parseInt(sc.nextLine());
        while (findById(id) != -1) {
            System.err.println("trùng id,nhập lại");
            id = Integer.parseInt(sc.nextLine());
        }
        System.out.print("tên phòng ");
        String nameRoom = sc.nextLine();
        System.out.print("tên khách hàng ");
        String customerName = sc.nextLine();
        System.out.print("tên nhân viên cho thuê ");
        String reservationStaffName = sc.nextLine();
        LocalDate startDay = null;
        try {
            System.out.print("ngày đặt phòng ");
            startDay = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        } catch (Exception e) {
            e.printStackTrace();
        }
        LocalDate endDay = null;
        try {
            System.out.print("ngày trả phòng  ");
            endDay = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        } catch (Exception e) {
            e.printStackTrace();
        }
        billList.add(new Bill(id, nameRoom, customerName, reservationStaffName, startDay, endDay));
    }

    public void editBill() {
        System.out.print("Nhập id ");
        int id = Integer.parseInt(sc.nextLine());
        while (findById(id) == -1) {
            System.err.print("id không tồn tại ,nhập lại ");
            id = Integer.parseInt(sc.nextLine());
        }
        System.out.print("tên phòng ");
        String nameRoom = sc.nextLine();
        bill.setRoomName(nameRoom);
        System.out.print("tên khách hàng ");
        String customerName = sc.nextLine();
        bill.setCustomerName(customerName);
        System.out.print("tên nhân viên cho thuê ");
        String reservationStaffName = sc.nextLine();
        bill.setReservationStaffName(reservationStaffName);
        LocalDate startDay = null;
        try {
            System.out.print("ngày đặt phòng ");
            startDay = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
            bill.setStartDay(startDay);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LocalDate endDay = null;
        try {
            System.out.print("ngày trả phòng  ");
            endDay = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
            bill.setEndDay(endDay);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("đổi thành công");
        System.out.println(billList.get(id));
    }
}

