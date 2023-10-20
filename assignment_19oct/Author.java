package assignment_19oct;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}
	
	public char gender() {
		return gender;
	}
	
	public void print() {
		System.out.println(getName());
		System.out.println(getEmail());
		System.out.println(gender());
	}

}
