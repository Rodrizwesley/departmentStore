package com.wesley.departmentStore.model.entities;

public class Person extends Users {

	private Integer idPerson;
	private String nmPerson;
	private String emailPerson;
	private String birthPerson;
	private Double baseSalary;
	
	public Person() {
		
	}

	public Person(Integer idRole, String nmRole, Integer idUser, String userLogin, String userPassword,
			Integer idPerson, String nmPerson, String emailPerson, String birthPerson, Double baseSalary) {
		
		super(idRole, nmRole, idUser, userLogin, userPassword);
		this.idPerson = idPerson;
		this.nmPerson = nmPerson;
		this.emailPerson = emailPerson;
		this.birthPerson = birthPerson;
		this.baseSalary = baseSalary;
	}

	public Integer getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Integer idPerson) {
		this.idPerson = idPerson;
	}

	public String getNmPerson() {
		return nmPerson;
	}

	public void setNmPerson(String nmPerson) {
		this.nmPerson = nmPerson;
	}

	public String getEmailPerson() {
		return emailPerson;
	}

	public void setEmailPerson(String emailPerson) {
		this.emailPerson = emailPerson;
	}

	public String getBirthPerson() {
		return birthPerson;
	}

	public void setBirthPerson(String birthPerson) {
		this.birthPerson = birthPerson;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((idPerson == null) ? 0 : idPerson.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (idPerson == null) {
			if (other.idPerson != null)
				return false;
		} else if (!idPerson.equals(other.idPerson))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [idPerson=" + idPerson + ", nmPerson=" + nmPerson + ", emailPerson=" + emailPerson
				+ ", birthPerson=" + birthPerson + ", baseSalary=" + baseSalary + "]";
	}
	
}
