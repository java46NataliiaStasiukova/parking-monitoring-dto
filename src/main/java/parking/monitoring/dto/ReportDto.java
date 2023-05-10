package parking.monitoring.dto;

public class ReportDto {

	public long carNumber;
	public long driverNumber;
	public String parkingZone;
	public String date;
	public double cost;
	public String status;
	public String driverName;

	public ReportDto(long carNumber, long driverNumber, String parkingZone, String date, double cost, String status, String driverName) {
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
