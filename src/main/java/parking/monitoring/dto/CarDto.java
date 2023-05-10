package parking.monitoring.dto;

public class CarDto {

	public long carNumber;
	public long driverId;

	public CarDto(long carNumber, long driverId) {
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
