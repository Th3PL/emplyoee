package entities;

public class Emplyoee {
 private Integer id;
 private String name;
 private Double Salary;
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
public Double getSalary() {
	return Salary;
}
public void setSalary(Double salary) {
	Salary = salary;
}
 
public void increaseSalary(double percentage) {
	setSalary(getSalary() + ((percentage / 100) * getSalary()));
}

public String status() {
	return getId() + ", " + getName() + ", " + getSalary();
}



}
