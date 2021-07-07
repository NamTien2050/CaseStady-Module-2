package hotelmanager;

import java.util.Date;

public class CreateInvoice {
    private String roomName, customerName, reservationStaffName;
    private Date startDay, endDate;

    public CreateInvoice() {
    }

    public CreateInvoice(String roomName, String customerName, String reservationStaffName, Date startDay, Date endDate) {
        this.roomName = roomName;
        this.customerName = customerName;
        this.reservationStaffName = reservationStaffName;
        this.startDay = startDay;
        this.endDate = endDate;
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

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "CreateInvoice{" +
                "roomName='" + roomName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", reservationStaffName='" + reservationStaffName + '\'' +
                ", startDay=" + startDay +
                ", endDate=" + endDate +
                '}';
    }
}
