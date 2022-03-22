package com.sahabt.library.domain.borrow;

import java.util.Date;
import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class Delivery {

	private Date deliveryDate;

	public static Delivery of(Date deliveryDate) {
		return new Delivery(deliveryDate);
	}
	private Delivery(Date deliveryDate) {
		super();
		this.deliveryDate = deliveryDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deliveryDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Delivery other = (Delivery) obj;
		return Objects.equals(deliveryDate, other.deliveryDate);
	}

	@Override
	public String toString() {
		return "Delivery [deliveryDate=" + deliveryDate + "]";
	}
	
	
}
