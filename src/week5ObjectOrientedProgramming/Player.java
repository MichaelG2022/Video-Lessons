package week5ObjectOrientedProgramming;

public class Player {
	
	private String name;
	private String position;
	private String speciality;

	public Player (String name, String position, String specialty) {
		this.name = name;
		this.position = position;
		this.speciality = specialty;
	} // end Player
	
	public void describe() {
		System.out.println("Player: " + name + "\t\tPosition: " + position + "\tSpecialty: " + speciality);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
} // end CLASS
