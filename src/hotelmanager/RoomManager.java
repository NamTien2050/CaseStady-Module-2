package hotelmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomManager {
    private static ArrayList<Room> roomsList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public RoomManager() {
    }

    static {
        roomsList.add(new Room(178, "178A", 3, 3, 4762000.0, "trống"));
        roomsList.add(new Room(163, "163C", 1, 1, 2119000.0, "đang sửa"));
        roomsList.add(new Room(190, "190B", 2, 2, 3285000.0, "sẵn sàng"));
        roomsList.add(new Room(126, "163B", 2, 2, 3285000.0, "trống"));
        roomsList.add(new Room(152, "154C", 1, 1, 2119000.0, "sẵn sàng"));
        roomsList.add(new Room(134, "134C", 1, 1, 2119000.0, "đã thuê"));
        roomsList.add(new Room(124, "134A", 3, 3, 4762000.0, "đã thuê"));
        roomsList.add(new Room(158, "176A", 3, 3, 4762000.0, "đã thuê"));
        roomsList.add(new Room(191, "134B", 2, 2, 3285000.0, "đã thuê"));
        roomsList.add(new Room(101, "176C", 1, 1, 2119000.0, "đã thuê"));
    }

    public int findByRoomName(String Name) {
        for (int i = 0; i < roomsList.size(); i++) {
            if (roomsList.get(i).getRoomName().equals(Name))
                return i;
        }
        return -1;
    }

    public int findById(int id) {
        for (int i = 0; i < roomsList.size(); i++) {
            if (roomsList.get(i).getId() == id)
                return i;
        }
        return -1;
    }

    public void showRoom() {
        for (Room r : roomsList) {
            System.out.println("Tên Phòng " + r.getRoomName() + "\n" +
                    "giá phòng " + r.getRentalPrice() + "\n" +
                    "trạng thái phòng " + r.getRoomStatus());
        }
    }

    public void roomChecking() {
        System.out.print("Nhập tên phòng ");
        String name = sc.nextLine();
        while (findByRoomName(name) != -1) {
            System.err.print("phòng không tồn tại, mời nhập lại ");
            name = sc.nextLine();
        }
        System.out.println("Trạng thái phòng " + name + ": " + roomsList.get(findByRoomName(name)).getRoomStatus());
    }

    public Room createRoom() {
        System.out.print("Nhập id ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("tên phòng ");
        String nameRoom = sc.nextLine();
        System.out.print("số phòng ngủ ");
        int numberBedrooms = Integer.parseInt(sc.nextLine());
        System.out.print("số phòng vệ sinh ");
        int numberToilets = Integer.parseInt(sc.nextLine());
        System.out.print("giá phòng ");
        double rentalPrice = Double.parseDouble(sc.nextLine());
        System.out.print("Trạng thái phòng ");
        String roomStatus = sc.nextLine();
        Room room = new Room(id, nameRoom, numberBedrooms, numberToilets, rentalPrice, roomStatus);
        return room;
    }

    public void addRoom() {
        Room room = createRoom();
        int id = room.getId();
        while (findById(id) != -1) {
            System.err.println("trùng id, nhập lại");
            id = Integer.parseInt(sc.nextLine());
        }
        room.setId(id);
        roomsList.add(room);
    }

    public Double getPriceByRoom(String name) {
        for (int i = 0; i < roomsList.size(); i++) {
            Room room = roomsList.get(i);
            if (room.getRoomName().equals(name)) {
                return room.getRentalPrice();
            }
        }
        return null;
    }

    public void showPriceByRoom() {
        System.out.print("nhập giá tiền ");
        double price =Double.parseDouble(sc.nextLine());
        for (int i = 0; i < roomsList.size(); i++) {
            if(roomsList.get(i).getRentalPrice()==price)
                System.out.println("Tên Phòng " + roomsList.get(i).getRoomName() + "\n" +
                        "giá phòng " + roomsList.get(i).getRentalPrice() + "\n" +
                        "trạng thái phòng " + roomsList.get(i).getRoomStatus());
        }
    }

    public Room editRoom() {
        int id = -1;
        while (id <= 0) {
            try {
                System.out.print("Nhập id ");
                id = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                id = -1;
            }
        }
        while (findById(id) == -1) {
            System.out.print("id không tồn tại, nhập lại ");
            id = Integer.parseInt(sc.nextLine());
        }
        System.out.print("tên phòng ");
        String nameRoom = sc.nextLine();
        System.out.print("số phòng ngủ ");
        int numberBedrooms = Integer.parseInt(sc.nextLine());
        System.out.print("số phòng vệ sinh ");
        int numberToilets = Integer.parseInt(sc.nextLine());
        System.out.print("giá phòng ");
        double rentalPrice = Double.parseDouble(sc.nextLine());
        System.out.print("Trạng thái phòng ");
        String roomStatus = sc.nextLine();
        return new Room(nameRoom, numberBedrooms, numberToilets, rentalPrice, roomStatus);
//            RoomManager manager = new RoomManager();
//            Room newRoom = manager.createRoom();
//            Room room = roomsList.get(index);
//            room.setRoomName(createRoom().getRoomName());
//            room.setNumberBedrooms(newRoom.getNumberBedrooms());
//            room.setNumberToilets(newRoom.getNumberToilets());
//            room.setRentalPrice(newRoom.getRentalPrice());
//            room.setRoomStatus(newRoom.getRoomStatus());
//            System.out.println("doi thanh cong");
//            System.out.println(roomsList.get(index));

    }
}
