package com.sahabt.library.domain.catalog;

import java.util.Base64;
import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class Cover {
	private byte[] cover;

	public static Cover of(String base64Value) {
		return new Cover(Base64.getDecoder().decode(base64Value));
	}

	public static Cover of(byte[] Cover) {
		Objects.requireNonNull(Cover);
		if (Cover.length == 0)
			throw new IllegalArgumentException("Cover must have at least one byte.");
		return new Cover(Cover);
	}

	private Cover(byte[] Cover) {
		this.cover = Cover;
	}
	
	public byte[] getCover() {
		return cover;
	}
	
}
