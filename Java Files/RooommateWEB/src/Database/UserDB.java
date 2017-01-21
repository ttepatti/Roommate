package Database;

import java.util.ArrayList;
import java.util.List;

import Objects.User;

public class UserDB {

	public static List<User> userList = new ArrayList<User>();
	
	//users
	private static User tim = new User("admin", "ttepatti", "Tim", "Tepatti", 1, "mockEmail1@gmail.com");
	private static User shane = new User("admin", "ShaBoiJimmy", "Shane", "Combs", 2, "mockEmail2@gmail.com");
	private static User andrew = new User("admin", "darttdragon", "Andrew", "Dartt", 3, "mockEmail3@gmail.com");
	private static User lindsey = new User("admin", "xXCumCumInBumBumXx", "Lindsey", "Nicoles", 4, "mockEmail4@gmail.com");

	static{
		userList.add(tim);
		userList.add(shane);
		userList.add(andrew);
		userList.add(lindsey);
	}
	
	public List<User> retrieveAllUsers(){
		return userList;
	}
	
	public User retrieveUserById(int id){
		for(int i = 0; i < userList.size(); i++){
			User userAtIndex = userList.get(i);
			if(userAtIndex.getIdNumber() == id){
				return userAtIndex;
			}
		}
		return null;
	}
	
	public User retrieveIndividualUser(User user){
		for(int i = 0; i < userList.size(); i++){
			User userAtIndex = userList.get(i);
			if(userAtIndex.equals(user)){
				return userAtIndex;
			}
		}
		return null;
	}
	
	public boolean insertUser(User user){
		return userList.add(user);
	}
	
	public boolean deleteUser(User user){
		return userList.remove(user);
	}
	
}
