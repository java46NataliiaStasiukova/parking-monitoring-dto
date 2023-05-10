package parking.monitoring.dto;

public class DriverDto {

	public long id;
	public String name;
	public String email;
	public String birthdate;

	public DriverDto(long id, String name, String email, String birthdate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthdate = birthdate;
	}

	public DriverDto() {

	}

	@Override
	public String toString() {
		return "DriverDto [driverId=" + id + ", name=" + name + ", email=" + email + ", birthdate=" + birthdate
				+ "]";
	}



}
