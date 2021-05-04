package entities;

import abstracts.Entities;

public class Customer implements Entities{
	
	private String id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int yearOfBirthDate;
	
	public Customer(String id, String firstName, String lastName, String nationalityId, int yearOfBirthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.yearOfBirthDate = yearOfBirthDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getYearOfBirthDate() {
		return yearOfBirthDate;
	}
	public void setYearOfBirthDate(int yearOfBirthDate) {
		this.yearOfBirthDate = yearOfBirthDate;
	}

}
