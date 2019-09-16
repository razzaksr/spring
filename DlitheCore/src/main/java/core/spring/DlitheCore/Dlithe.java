package core.spring.DlitheCore;

public class Dlithe
{
	private String person, place, email;

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "person=" + person + ", place=" + place + ", email=" + email;
	}
	
}
