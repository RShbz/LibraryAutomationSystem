package com.sahabt.library.domain.credicard;

import java.util.Date;
import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class ExpirationDate {
	
	private Date expirationDate;

	public static ExpirationDate of (Date expirationDate) {
		return new ExpirationDate(expirationDate);
	}
	private ExpirationDate(Date expirationDate) {
		super();
		this.expirationDate = expirationDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(expirationDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExpirationDate other = (ExpirationDate) obj;
		return Objects.equals(expirationDate, other.expirationDate);
	}

	@Override
	public String toString() {
		return "ExpirationDate [expirationDate=" + expirationDate + "]";
	}
	
	
}
