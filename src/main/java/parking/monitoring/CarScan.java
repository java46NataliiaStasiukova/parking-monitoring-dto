package parking.monitoring;

public class CarScan {
	
	public long carNumber;
	public String parkingZone;
	
	public CarScan(long carNumber, String parkingZone) {
		this.carNumber = carNumber;
		this.parkingZone = parkingZone;
	}
	
	public CarScan() {
		
	}

	@Override
	public String toString() {
		return "CarScan [carNumber=" + carNumber + ", parkingZone=" + parkingZone + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (carNumber ^ (carNumber >>> 32));
		result = prime * result + ((parkingZone == null) ? 0 : parkingZone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarScan other = (CarScan) obj;
		if (carNumber != other.carNumber)
			return false;
		if (parkingZone != other.parkingZone)
			return false;
		return true;
	}


}
