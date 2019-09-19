package mvc.dlithe.jpa.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resource
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String role;
	private Integer exp;
	private Double lpa;
	private String skill;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Resource() {}
	public Resource(String name, String role, Integer exp, Double lpa, String skill) {
		super();
		this.name = name;
		this.role = role;
		this.exp = exp;
		this.lpa = lpa;
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Resource [id="+id+", name=" + name + ", role=" + role + ", exp=" + exp + ", lpa=" + lpa + ", skill=" + skill + "]\n";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getExp() {
		return exp;
	}
	public void setExp(Integer exp) {
		this.exp = exp;
	}
	public Double getLpa() {
		return lpa;
	}
	public void setLpa(Double lpa) {
		this.lpa = lpa;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
}
