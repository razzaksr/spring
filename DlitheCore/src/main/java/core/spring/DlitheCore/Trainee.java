package core.spring.DlitheCore;

import java.util.List;

public class Trainee implements Project
{
	private Dlithe dlithe;
	public Dlithe getDlithe() {
		return dlithe;
	}
	public void setDlithe(Dlithe dlithe) {
		this.dlithe = dlithe;
	}
	private List<String> skills;
	private String career;
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public void info() {
		// TODO Auto-generated method stub
		System.out.println(skills+" "+career+" "+dlithe.toString());
	}
}
