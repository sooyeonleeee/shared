package myclass;

public class MyClass {
	String buildingName;
	int roomNumber;

	Student student;

	// 생성자를 통해서 주입받을 예정
	public MyClass(String buildingName, int roomNumber) {
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}

	// property를 통해서 주입받을 예정
	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "MyClass [buildingName=" + buildingName + ", roomNumber="
				+ roomNumber + ", student=" + student + "]";
	}

}
