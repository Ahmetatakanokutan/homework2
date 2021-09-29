package homework_2;

public class InstructorManager extends UserManager {

	public void addToLesson(user user1)
	{
		System.out.println(user1.getName() + " isimli egitmen derse atandi");
	}
	public void delete(user user1)
	{
		System.out.println(user1.getName() + " isimli egitmen dersten silindi");
	}
	public void addHomework(user user1){
		System.out.println(user1.getName() + " isimli egitmen yeni bir odev ekledi");
	}
}
