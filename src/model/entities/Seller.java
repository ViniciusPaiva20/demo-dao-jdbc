package model.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Seller implements Serializable {

	private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String emai;
	private LocalDateTime birthDate;
	private Double baseSalary;
	
	private Department department;
	
	public Seller() {
	}

	public Seller(Integer id, String name, String emai, LocalDateTime birthDate, Double baseSalary, Department department) {
		this.id = id;
		this.name = name;
		this.emai = emai;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", emai=" + emai + ", birthDate=" + fmt.format(birthDate) + ", baseSalary="
				+ baseSalary + ", department=" + department + "]";
	}
}
