package parking.monitoring;

import java.time.LocalDateTime;

public class CarPaymentData {
	
	public long carNumber;
	public String status;
	public LocalDateTime paidFrom;
	public LocalDateTime paidTo;
	
	public CarPaymentData(long carNumber, String status, LocalDateTime paidFrom, LocalDateTime paidTo) {
		this.carNumber = carNumber;
		this.status = status;
		this.paidFrom = paidFrom;
		this.paidTo = paidTo;
	}
	
	public CarPaymentData() {
		
	}

	@Override
	public String toString() {
		return "CarPaymentData [carNumber=" + carNumber + ", status=" + status + ", paidFrom=" + paidFrom + ", paidTo="
				+ paidTo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (carNumber ^ (carNumber >>> 32));
		result = prime * result + ((paidFrom == null) ? 0 : paidFrom.hashCode());
		result = prime * result + ((paidTo == null) ? 0 : paidTo.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		CarPaymentData other = (CarPaymentData) obj;
		if (carNumber != other.carNumber)
			return false;
		if (paidFrom == null) {
			if (other.paidFrom != null)
				return false;
		} else if (!paidFrom.equals(other.paidFrom))
			return false;
		if (paidTo == null) {
			if (other.paidTo != null)
				return false;
		} else if (!paidTo.equals(other.paidTo))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}


}
