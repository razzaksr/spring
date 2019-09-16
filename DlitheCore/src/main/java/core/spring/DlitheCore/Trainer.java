package core.spring.DlitheCore;

public class Trainer implements Project
{
	private Dlithe cognizant;
	public Dlithe getCognizant() {
		return cognizant;
	}
	public void setCognizant(Dlithe cognizant) {
		this.cognizant = cognizant;
	}
	private String role;
	private int clients;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getClients() {
		return clients;
	}
	public void setClients(int clients) {
		this.clients = clients;
	}
	public void info() {
		// TODO Auto-generated method stub
		System.out.println(role+" "+clients+" "+cognizant.toString());
	}
}
