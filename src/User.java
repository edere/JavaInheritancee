
public class User {

	public int id;
	public String name;
	public String lastName;
	public String contact;
	public String userType;
	
    public User() {
		
	}
	public User(int id, String name, String lastName, String contact,String userType) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.contact = contact;
		this.userType = userType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getuserType() {
		return userType;
	}
	public void setType(String userType) {
		this.userType = userType;
	}
	
	
	
	
}
