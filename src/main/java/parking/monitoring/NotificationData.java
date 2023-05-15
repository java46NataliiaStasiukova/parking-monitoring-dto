package parking.monitoring;

public class NotificationData {

	public long carNumber;
	public String email;
	public String name;
	public long driverId;
	
	public NotificationData(long carNumber, String email, String name, long driverId) {
		this.carNumber = carNumber;
		this.email = email;
		this.name = name;
		this.driverId = driverId;
	}
	
	public NotificationData() {
		
	}

	@Override
	public String toString() {
		return "NotificationData [carNumber=" + carNumber + ", email=" + email + ", name=" + name + ", driverId="
				+ driverId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (carNumber ^ (carNumber >>> 32));
		result = prime * result + (int) (driverId ^ (driverId >>> 32));
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		NotificationData other = (NotificationData) obj;
		if (carNumber != other.carNumber)
			return false;
		if (driverId != other.driverId)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	
	
}
