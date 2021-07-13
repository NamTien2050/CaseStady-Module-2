package hotelmanager;

import java.time.LocalDate;

public class Bill {
    private int idBill;
    private String roomName, customerName, reservationStaffName;
    private LocalDate startDay, endDay;

    public Bill() {
    }

    public Bill(int idBill, String roomName, String customerName, String reservationStaffName, LocalDate startDay, LocalDate endDay) {
        this.idBill = idBill;
        this.roomName = roomName;
        this.customerName = customerName;
        this.reservationStaffName = reservationStaffName;
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getReservationStaffName() {
        return reservationStaffName;
    }

    public void setReservationStaffName(String reservationStaffName) {
        this.reservationStaffName = reservationStaffName;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "idBill= " + idBill +
                ", roomName= '" + roomName + '\'' +
                ", customerName= '" + customerName + '\'' +
                ", reservationStaffName= '" + reservationStaffName + '\'' +
                ", startDay= " + startDay +
                ", endDay= " + endDay +
                '}';
    }
}
