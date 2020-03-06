package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Family {
	protected List<Member> members = new ArrayList<>();
	
	public Family(){
		this.createFamily();
	}

	public List<Member> getMembers() {
		return members;
	}

	public abstract void createFamily();
}
