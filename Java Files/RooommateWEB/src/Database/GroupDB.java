package Database;

import java.util.ArrayList;
import java.util.List;

import Objects.Group;

public class GroupDB {

	public List<Group> groupList = new ArrayList<Group>();
	
	public List<Group> retrieveAllGroups(){
		return groupList;
	}
	
	public Group retrieveGroupByCode(String code){
		for(int i = 0; i < groupList.size(); i++){
			Group groupAtIndex = groupList.get(i);
			if(groupAtIndex.getGroupCode().equals(code)){
				return groupAtIndex;
			}
		}
		return null;
	}
	
	public boolean removeGroup(Group group){
		return groupList.remove(group);
	}
	
	public boolean addGroup(Group group){
		return groupList.add(group);
	}

}
