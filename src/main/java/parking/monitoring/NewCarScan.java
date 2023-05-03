package parking.monitoring;

public class NewCarScan {
	
	public long carNumber;
	public String parkingZone;
	
	public NewCarScan(long carNumber, String parkingZone) {
		this.carNumber = carNumber;
		this.parkingZone = parkingZone;
	}
	
	public NewCarScan() {
		
	}

	@Override
	public String toString() {
		return "NewCarScan [carNumber=" + carNumber + ", parkingZone=" + parkingZone + "]";
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
		NewCarScan other = (NewCarScan) obj;
		if (carNumber != other.carNumber)
			return false;
		if (parkingZone == null) {
			if (other.parkingZone != null)
				return false;
		} else if (!parkingZone.equals(other.parkingZone))
			return false;
		return true;
	}

}
