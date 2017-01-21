package Objects;

public class User {
	
	private String password;
	private String userName;
	private String firstName;
	private String lastName;
	private int idNumber;
	private String email;

	public User(){
		
	}
	
	public User(String password, String userName, String firstName, String lastName, int idNumber, String email){
		this.password = password;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.email = email;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getUsername(){
		return userName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getIdNumber(){
		return idNumber;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public void setUsername(String username){
		this.userName = username;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setIdNumber(int idNumber){
		this.idNumber = idNumber;
	}
	
	public void setEmail(String email){
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [password=" + password + ", userName=" + userName
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", idNumber=" + idNumber + ", email=" + email + "]";
	}
	
}
