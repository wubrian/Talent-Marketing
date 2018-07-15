public class ProjectOwner{

	private int ownerID;
	
	private User user;
	private Project project;

	Map<Integer, Collection<Integer>> map = new HashMap<Integer, Collection<Integer>>();

	public ProjectOwner(int ownerID){

		this.ownerID = ownerID;
	}

	public boolean determine(Project project, User user){
		if(map.containsKey(project.getProjectID())){
			List<String> projSkills = project.getSkills();
			List<String> userSkills = user.getSkills();
			int m = projSkills.size();
			int n = userSkills.size();
			int count;

			if(userSkills.isEmpty()){
				return false;
			}

			if(userSkills.isEmpty() && projSkills.isEmpty()){
				return true;
			}

			for(int i = 0; i < m; i++){
				for(int j = 0; j < n; j++){
					if(projSkills[i].equals(userSkills[j])){
						count++;
					}
				}
			}

			if(count > m / 2){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			System.out.println("This owner does not own this project");
			return false;
		}
	}

	public void feedBack(userID){

	}
	
	public int rating(userID){

	}

	public void addProject(int projectID){
		Collection<Integer> listOfMembers = map.get(projectID);
		if(listOfMembers == null){
			listOfMembers = new ArrayList<Integer>();
			map.put(projectID, listOfMembers);
		}
		else{
			System.out.println("Project already exists");
		}
	}

	public void addUserToProjMember(int projectID, int userID){
		Collection<Integer> listOfMembers = map.get(projectID);
		if(listOfMembers == null){
			listOfMembers = new ArrayList<Integer>();
			map.put(projectID, listOfMembers);
		}
		listOfMembers.add(userID);
	}
	
}