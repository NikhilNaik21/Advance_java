package com.met.model;

public class Address {
private static int count = 0;
	
	private String id;
	private String city;
	private String country;
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Address.count = count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address() {
		
		id = "A" + ++count;
		
		System.out.println("Default address object created with id:"+ id);
		
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", country=" + country + "]";
	}
}
