import java.util.Objects;

public class Room {
    private final String type;
    private final int bedCount;
    private final int roomNumber;
    private final String amenities;

    public Room(String type, int bedCount, int roomNumber, String amenities) {
        this.type = type;
        this.bedCount = bedCount;
        this.roomNumber = roomNumber;
        this.amenities = amenities;
    }

    public String getType() {
        return type;
    }

    public int getBedCount() {
        return bedCount;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getAmenities() {
        return amenities;
    }

    //toString
    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", bedCount=" + bedCount +
                ", roomNumber=" + roomNumber +
                ", amenities='" + amenities + '\'' +
                '}';
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return bedCount == room.bedCount &&
                roomNumber == room.roomNumber &&
                Objects.equals(type, room.type) &&
                Objects.equals(amenities, room.amenities);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(type, bedCount, roomNumber, amenities);
    }
}
