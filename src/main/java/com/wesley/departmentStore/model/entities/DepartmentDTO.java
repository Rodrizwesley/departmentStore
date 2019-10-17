package com.wesley.departmentStore.model.entities;

public class DepartmentDTO {
	
	private Integer idDepartment;
	
	private String nmDepartment;

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
		DepartmentDTO other = (DepartmentDTO) obj;
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
