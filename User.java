public class User {

	private String name;
	private int userID;
	private ArrayList<String> skillList;
	private ArrayList<String> interestList;

	private Project project;
	ArrayList<Project> projList = new ArrayList<Project>();

	int rate;

	//Constructor
	public User(String name, int userID, ArrayList<String> skillList, ArrayList<String> interestList){
		this.name  = name;
		this.userID = userID;
		this.skillList = skillList;
		this.interestList = interestList;
	}

	//User apply for projects
	/*
	public void apply(int projectID, int ownerID, int userID){
		projList.get(projectID);
		
	}*/

	public String getUserName(){
		return name;
	}

	public int getUserID(){
		return userID;
	}

	public List<String> getSkills(){
		return skillList;
	}

	public List<String> getInterest(){
		return interestList;
	}

	public void addSkill(String skill){
		skillList.add(skill);
	}

	public void addRate(int add){

		rate = (rate * (projList.size()) + add)/projList.size();

	}

}