public class Project{

	private int projectID;
	private ArrayList<Integer> memberLists; 
	private ArrayList<String> skills; 


	public Project(int projectID, ArrayList<Integer> memberLists, ArrayList<String> skills){

		this.projectID = projectID;
		this.memberLists = memberLists;
		this.skills = skills;

	}

	public int getProjectID(){
		return projectID;
	}

	public List<Integer> getMemberLists(){
		return memberLists;
	}

	public List<String> getSkills(){
		return skills;
	}

	public void addMember(int memberID){
		memberLists.add(memberID);
	}

}