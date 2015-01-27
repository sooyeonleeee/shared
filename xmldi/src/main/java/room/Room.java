package room;

public class Room {
	private String buildingName;
	private int floor;
	private int roomNumber;
	
	public Room() {}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Room [buildingName=" + buildingName + ", floor=" + floor
				+ ", roomNumber=" + roomNumber + "]";
	}
	
	
	
}
