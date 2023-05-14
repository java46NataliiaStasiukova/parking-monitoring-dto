package parking.monitoring.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class ReportDto {

	@NotNull(message = "car number cannot be null")
	public Long carNumber;
	@NotNull(message = "driver number cannot be null")
	public Long driverNumber;
	@Pattern(regexp = "1|2|3", message = "should be either: 1, 2, 3")
	public String parkingZone;
	@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}", message = "should be format: YYYY-MM-DD-THH:MM")
	public String date;
	@NotNull(message = "fine cost cannot be null")
	public Double cost;
	@Pattern(regexp = "paid|not-paid|canceled", message = "should be either: paid, not-paid or canceled")
	public String status;
	@NotNull(message = "driver name cannot be null")
	public String driverName;

	public ReportDto(Long carNumber, Long driverNumber, String parkingZone, String date, Double cost, String status, String driverName) {
		this.carNumber = carNumber;
		this.driverNumber = driverNumber;
		this.parkingZone = parkingZone;
		this.date = date;
		this.cost = cost;
		this.status = status;
		this.driverName = driverName;
	}

	public ReportDto() {

	}

	@Override
	public String toString() {
		return "ReportDto [carNumber=" + carNumber + ", driverId=" + driverNumber + ", parkingZone=" + parkingZone
				+ ", date=" + date + ", cost=" + cost + ", status=" + status + ", driverName=" + driverName + "]";
	}



}
