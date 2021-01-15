package com.jievhaha;

public class Address {
	private String detile;

	public String getDetile() {
		return detile;
	}

	public void setDetile(String detile) {
		this.detile = detile;
	}

	public Address(String detile) {
		this.detile = detile;
	}

	public Address() {
	}

	@Override
	public String toString() {
		return detile;
	}
}
