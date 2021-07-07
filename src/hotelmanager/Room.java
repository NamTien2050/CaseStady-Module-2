package hotelmanager;

public class Room {
    private int id, numberToilets, numberBedrooms;
    private String roomName, roomStatus;

    public Room() {
    }

    public Room(int id, String roomName, int numberBedrooms, int numberToilets, String roomStatus) {
        this.id = id;
        this.numberToilets = numberToilets;
        this.numberBedrooms = numberBedrooms;
        this.roomName = roomName;
        this.roomStatus = roomStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberToilets() {
        return numberToilets;
    }

    public void setNumberToilets(int numberToilets) {
        this.numberToilets = numberToilets;
    }

    public int getNumberBedrooms() {
        return numberBedrooms;
    }

    public void setNumberBedrooms(int numberBedrooms) {
        this.numberBedrooms = numberBedrooms;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String isRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomName='" + roomName +
                ", numberBedrooms=" + numberBedrooms +
                ", numberToilets=" + numberToilets + '\'' +
                ", roomStatus=" + roomStatus +
                '}';
    }
}
