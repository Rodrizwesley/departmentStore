package com.wesley.departmentStore.model.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="departments") 
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
    @Column(name="idDepartment") 
	private Integer idDepartment;
	
	@Column(name="nmDepartment") 
	private String nmDepartment;
	
	public Department() {
		
	}

	public Department(Integer idDepartment, String nmDepartment) {
		super();
		this.idDepartment = idDepartment;
		this.nmDepartment = nmDepartment;
	}

	public Integer getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(Integer idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getNmDepartment() {
		return nmDepartment;
	}

	public void setNmDepartment(String nmDepartment) {
		this.nmDepartment = nmDepartment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDepartment == null) ? 0 : idDepartment.hashCode());
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
		Department other = (Department) obj;
		if (idDepartment == null) {
			if (other.idDepartment != null)
				return false;
		} else if (!idDepartment.equals(other.idDepartment))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [idDepartment=" + idDepartment + ", nmDepartment=" + nmDepartment + "]";
	}

}
