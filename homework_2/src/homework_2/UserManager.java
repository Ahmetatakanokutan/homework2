package homework_2;

public class UserManager {

	public void addToLesson(user user1){
		
	}
	public void deletefromLesson(user user1) {
		
	}
	public void addHomework(user user1){
		
	}
	public void addMultiple(user[] users)
	{
		for(user user1 : users)
		{
			addToLesson(user1);
		}
	}
	public void deleteMultiple(user[] users)
	{
		for(user user1 : users)
		{
			deletefromLesson(user1);
		}
	}

	
}
