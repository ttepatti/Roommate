package Objects;

import java.io.File;
import java.util.List;

public class Group {

	private List<User> roommates;
	private List<File> documentsList;
	private double groupTotal;
	private String groupCode;
	
	public boolean removeRoommate(User user){
		for(int i = 0; i < roommates.size();i++){
			User roommateAtIndex = roommates.get(i);
			if(roommateAtIndex.equals(user)){
				roommates.remove(roommateAtIndex);
				return true;
			}
		}
		return false;
	}
	
	public boolean addRoommate(User user){
		for(int i = 0; i < roommates.size();i++){
			User roommateAtIndex = roommates.get(i);
			if(roommateAtIndex.equals(user)){
				roommates.add(roommateAtIndex);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeFile(File file){
		for(int i = 0; i < documentsList.size();i++){
			File fileAtIndex = documentsList.get(i);
			if(fileAtIndex.equals(file)){
				documentsList.remove(fileAtIndex);
				return true;
			}
		}
		return false;
	}
	
	public boolean addFile(File file){
		for(int i = 0; i < documentsList.size();i++){
			File fileAtIndex = documentsList.get(i);
			if(fileAtIndex.equals(file)){
				documentsList.add(fileAtIndex);
				return true;
			}
		}
		return false;
	}
	
	public List<User> getRoommates() {
		return roommates;
	}
	public void setRoommates(List<User> roommates) {
		this.roommates = roommates;
	}
	public List<File> getDocumentsList() {
		return documentsList;
	}
	public void setDocumentsList(List<File> documentsList) {
		this.documentsList = documentsList;
	}
	public double getGroupTotal() {
		return groupTotal;
	}
	public void setGroupTotal(double groupTotal) {
		this.groupTotal = groupTotal;
	}
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	
	
}
