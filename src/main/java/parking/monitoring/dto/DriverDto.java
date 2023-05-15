package parking.monitoring.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class DriverDto {

	//@NotNull(message = "id cannot be null")
	public long id;
	@NotEmpty(message = "name cannot be empty")
	public String name;
	@Email(message = "should be email format") @NotEmpty(message = "email cannot be empty")
	public String email;
	@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "should be ISO format") @NotEmpty(message = "birthday cannot be empty")
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
