package parking.monitoring.dto;

import jakarta.validation.constraints.NotNull;

public class CarDto {

	@NotNull(message = "car number cannot be null")
	public Long carNumber;
	@NotNull(message = "driver id cannot be null")
	public Long driverId;

	public CarDto(Long carNumber, Long driverId) {
		this.carNumber = carNumber;
		this.driverId = driverId;
	}

	public CarDto() {

	}

	@Override
	public String toString() {
		return "CarDto [carNumber=" + carNumber + ", driverId=" + driverId + "]";
	}


}
