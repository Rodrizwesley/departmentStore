package com.wesley.departmentStore.model.entities;

public class Roles {
	
	private Integer idRole;
	private String nmRole;

	public Roles() {
		
	}

	public Roles(Integer idRole, String nmRole) {
		this.idRole = idRole;
		this.nmRole = nmRole;
	}

	public Integer getIdRole() {
		return idRole;
	}

	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}

	public String getNmRole() {
		return nmRole;
	}

	public void setNmRole(String nmRole) {
		this.nmRole = nmRole;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRole == null) ? 0 : idRole.hashCode());
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
		Roles other = (Roles) obj;
		if (idRole == null) {
			if (other.idRole != null)
				return false;
		} else if (!idRole.equals(other.idRole))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Roles [idRole=" + idRole + ", nmRole=" + nmRole + "]";
	}
	
	
}
