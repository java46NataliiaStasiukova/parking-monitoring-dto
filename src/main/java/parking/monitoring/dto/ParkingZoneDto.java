package parking.monitoring.dto;

public class ParkingZoneDto {
	
	public String parkingZone;
	public double fineCost;
	public String city;
	public String address;
	
	public ParkingZoneDto(String parkingZone, double fineCost, String city, String address) {
		this.parkingZone = parkingZone;
		this.fineCost = fineCost;
		this.city = city;
		this.address = address;
	}
	
	public ParkingZoneDto() {
		
	}

	@Override
	public String toString() {
		return "ParkingZoneDto [parkingZone=" + parkingZone + ", fineCost=" + fineCost + ", city=" + city + ", address="
				+ address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fineCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		ParkingZoneDto other = (ParkingZoneDto) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (Double.doubleToLongBits(fineCost) != Double.doubleToLongBits(other.fineCost))
			return false;
		if (parkingZone == null) {
			if (other.parkingZone != null)
				return false;
		} else if (!parkingZone.equals(other.parkingZone))
			return false;
		return true;
	}

}
